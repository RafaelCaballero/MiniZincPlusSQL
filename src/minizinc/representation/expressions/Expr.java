/**
 * 
 */
package minizinc.representation.expressions;

import antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.lists.ListExpr;
import minizinc.representation.expressions.sets.SetExpr;

/**
 * Java representation of general expressions in MiniZinc. It is an abstract
 * class. All the particular expressions extend this class.
 * 
 * @author rafa
 *
 */
public abstract class Expr implements MiniZincRepresentation, SubExpressions, Typeable, Cloneable {

	/**
	 * True if the expression has been already simplified Currently not used
	 */
	protected boolean simplified = false;

	@Override
	public String toString() {
		return print();
	}

	/**
	 * Parses an expression Grammar for expressions:
	 * <p>
	 * expr:
	 * </p>
	 * rbracketExpr<br>
	 * | boolComplexExpr<br>
	 * | arithComplexExpr<br>
	 * | setExpr <br>
	 * | listExpr<br>
	 * | expr infixOp expr<br>
	 * | ifExpr <br>
	 * | letExpr <br>
	 * | guardExpr<br>
	 * | predOrUnionExpr<br>
	 * | stringExpr<br>
	 * | caseExpr <br>
	 * | BOOL<br>
	 * | real<br>
	 * | integer<br>
	 * | ID<br>
	 * | '_'<br>
	 * 
	 * @param ctx
	 *            expression context
	 * @return Term representing the expression
	 */
	public static Expr expr(ExprContext ctx) {
		Expr t = null;
		if (Parsing.has(ctx.rbracketExpr())) {
			t = RbracketExpr.rbracketExpr(ctx.rbracketExpr());
		} else if (Parsing.has(ctx.boolComplexExpr())) {
			t = BoolComplexExpr.boolComplexExpr(ctx.boolComplexExpr());
		} else if (Parsing.has(ctx.arithComplexExpr())) {
			t = ArithExpr.arithComplexExpr(ctx.arithComplexExpr());
		} else if (Parsing.has(ctx.setExpr())) {
			t = SetExpr.setExpr(ctx.setExpr());
		} else if (Parsing.has(ctx.listExpr())) {
			t = ListExpr.listExpr(ctx.listExpr());
		} else if (Parsing.has(ctx.infixOp())) {
			ExprContext e0 = ctx.expr(0);
			ExprContext e1 = ctx.expr(1);
			Expr t0 = expr(e0);
			Expr t1 = expr(e1);
			t = InfixExpr.infixExpr(t0, t1, ctx.infixOp());
		} else if (Parsing.has(ctx.ifExpr())) {
			t = IfS.ifExpr(ctx.ifExpr());
		} else if (Parsing.has(ctx.letExpr())) {
			t = LetExpr.letExpr(ctx.letExpr());
		} else if (Parsing.has(ctx.predOrUnionExpr())) {
			t = PredicateCall.predOrUnionExpr(ctx.predOrUnionExpr());
		} else if (Parsing.hasTerminal(ctx.BOOL())) {
			t = BoolC.BOOLTerm(ctx.BOOL());
		} else if (Parsing.has(ctx.real())) {
			t = FloatC.realTerm(ctx.real());
		} else if (Parsing.has(ctx.integer())) {
			t = IntC.integerTerm(ctx.integer());
		} else if (Parsing.hasTerminal(ctx.ID())) {
			t = ID.IDTerm(ctx.ID());
		} else if (ctx.getText().equals("_")) {
			t = ID.IDTerm("_");
		} else
			Parsing.error("expr:  " + ctx.getText());
		return t;
	}

	@Override
	public abstract Expr clone();

	@Override
	public abstract boolean equals(Object e);

	@Override
	public abstract int hashCode();

	public Expr simplify() {
		return this;
	}

	/**
	 * Indicates if ep is a basic expression, that is an expression that can be
	 * considered as an atom in any context
	 * 
	 * @param ep
	 * @return
	 */
	public static boolean isBasic(Expr ep) {
		boolean r = ep instanceof IntC || ep instanceof PredicateCall || ep instanceof StringC || ep instanceof ID
				|| ep instanceof BoolC || ep instanceof FloatC || (ep instanceof Operand && ((Operand) ep).isBasic())
				|| ((ep instanceof MinusArithExpr) && Expr.isBasic(((MinusArithExpr) ep).getExpr()));
		return r;
	}

	/**
	 * Unwraps expressios eliminating round brackets and also extracting
	 * expressions inside operands
	 * 
	 * @param e
	 * @return
	 */
	public static Expr unwrap(Expr e) {
		Expr r = e;
		boolean unwrapped;
		do {
			unwrapped = false;
			if (r instanceof RbracketExpr) {
				r = ((RbracketExpr) r).getExprInside();
				unwrapped = true;
			} else if (r instanceof Operand) {
				r = ((Operand) r).getExpr();
				unwrapped = true;
			}
		} while (unwrapped);

		return r;
	}
}
