/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import antlr4.MiniZincGrammarParser.InfixOpContext;
import minizinc.representation.TypeName;

/**
 * An infix expression with Grammar: expr infixOp expr
 *
 * @author rafa
 *
 */
public class InfixExpr extends Expr {
	/**
	 * List of expressions combined by the operand. We allow more than two
	 * operands.
	 */
	protected List<Expr> e;
	protected InfixOp op;

	/**
	 * constructor
	 */
	public InfixExpr(InfixOp op, Expr e1, Expr e2) {
		e = new ArrayList<Expr>();
		e.add(e1.simplify());
		e.add(e2.simplify());
		this.op = op;
	}

	public InfixExpr(String op, Expr e1, Expr e2) {
		e = new ArrayList<Expr>();
		e.add(e1.simplify());
		e.add(e2.simplify());
		this.op = new InfixOp(op);
	}

	/**
	 * constructor for more than two operands
	 */
	public InfixExpr(InfixOp op, List<? extends Expr> le) {
		this.e = new ArrayList<Expr>();
		for (Expr expr : le)
			this.e.add(expr);
		this.op = op;
	}

	/**
	 * constructor for more than two operands
	 */
	public InfixExpr(String string, List<? extends Expr> le) {
		this.e = new ArrayList<Expr>();
		for (Expr expr : le)
			this.e.add(expr);
		this.op = new InfixOp(string);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		List<Expr> le = simplifyList(e);
		e = le;
		return printList(" " + op.print() + " ", e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.expressions.Expr#simplify()
	 */
	@Override
	public Expr simplify() {
		Expr r = this;

		// first simplify the arguments
		List<Expr> es = simplifyList(e);
		if (es != null)
			if (es.size() > 1)
				r = new InfixExpr(op, es);

		// if the operator is and / or then rely on this classes for
		// simplification
		String ops = op.print();
		if (ops.equals("/\\")) {
			And eAnd = new And(es);
			r = eAnd.simplify();
		} else if (ops.equals("\\/")) {
			Or eOr = new Or(es);
			r = eOr.simplify();
		} else if ((ops.equals("=") || ops.equals("=") || ops.equals("!=")) && es != null && es.size() == 2) {
			Expr e1s = es.get(0);
			Expr e2s = es.get(1);

			r = InfixArithBoolExpr.simplifyOp(r, ops, e1s, e2s);
		} // simplify String concatenation
		if (ops.equals("++") && es != null) {
			Expr ess = simplifyStringConc(es);
			if (ess != null)
				r = ess;
		}
		return r;
	}

	/**
	 * Simplified concatenations of Strings, changing "a"++"b" by "ab"
	 * 
	 * @param es
	 *            The list of arguments of ++, with 2 or more elements
	 * @return The result of the concatenation simplified
	 */
	private Expr simplifyStringConc(List<Expr> es) {
		Expr r = null;
		if (es != null) {
			if (es.size() == 1)
				r = es.get(0);
			else { // size >=2
				boolean changed = StringC.concat(es);
				if (changed)
					if (es.size() == 1)
						r = es.get(0);
					else
						r = new InfixExpr("++", es);
			}
		}
		return r;
	}

	/**
	 * Basic list simplification, based in the simplification of each element of
	 * the list
	 * 
	 * @param e
	 *            The list to simplify
	 * @return The simplified list
	 */
	private List<Expr> simplifyList(List<Expr> e) {
		boolean changed = false;
		List<Expr> r = null;
		List<Expr> le = new ArrayList<Expr>();
		for (Expr expr : e) {
			Expr ep = expr.simplify();

			// first case, a basic expression between round brackets
			if (ep instanceof RbracketExpr) {
				RbracketExpr ep2 = (RbracketExpr) ep;
				Expr epinside = ep2.getExprInside();
				if (isBasic(epinside)) {
					le.add(epinside);
					changed = true;
				} else
					le.add(ep);
				// second case, if it is not a basic expression and it is not
				// yet surrounded by () include ()
			} else if (!isBasic(ep)) {
				le.add(new RbracketExpr(ep));
				changed = true;
			} else
				le.add(ep);

			// if modified...
			if (!ep.equals(expr))
				changed = true;
		}

		// look for a fixpoint
		if (!changed)
			r = le;
		else
			r = simplifyList(le);
		return r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO at the moment I assume the type is the type of the first
		// operand...
		// which many times is wrong
		return e.get(0).type();
	}

	public static InfixExpr infixExpr(Expr t0, Expr t1, InfixOpContext ctx) {
		InfixExpr r = null;
		InfixOp infixop = InfixOp.infixop(ctx);
		r = new InfixExpr(infixop, t0, t1);

		return r;
	}

	@Override
	public InfixExpr clone() {
		InfixExpr r = null;
		List<Expr> ep = null;
		if (e != null) {
			ep = new ArrayList<Expr>();
			for (Expr exp : e)
				ep.add(exp.clone());

		}
		InfixOp opp = op == null ? null : op.clone();
		r = new InfixExpr(opp, e);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfixExpr other = (InfixExpr) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<Expr> e2 = this.applyTransformerList(t, e);
		e = e2;
	}

	/**
	 * @return the e
	 */
	public List<Expr> getE() {
		return e;
	}

	/**
	 * @return the op
	 */
	public InfixOp getOp() {
		return op;
	}

}
