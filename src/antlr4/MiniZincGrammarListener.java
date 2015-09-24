package antlr4;

// Generated from MiniZincGrammar.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniZincGrammarParser}.
 */
public interface MiniZincGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#model}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterModel(MiniZincGrammarParser.ModelContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#model}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitModel(MiniZincGrammarParser.ModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStat(MiniZincGrammarParser.StatContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStat(MiniZincGrammarParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#decl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDecl(MiniZincGrammarParser.DeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#decl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDecl(MiniZincGrammarParser.DeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#vardecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVardecl(MiniZincGrammarParser.VardeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#vardecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVardecl(MiniZincGrammarParser.VardeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#pardecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPardecl(MiniZincGrammarParser.PardeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#pardecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPardecl(MiniZincGrammarParser.PardeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#table}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTable(MiniZincGrammarParser.TableContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#table}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTable(MiniZincGrammarParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstraint(MiniZincGrammarParser.ConstraintContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstraint(MiniZincGrammarParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVar(MiniZincGrammarParser.VarContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVar(MiniZincGrammarParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOutput(MiniZincGrammarParser.OutputContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOutput(MiniZincGrammarParser.OutputContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSolve(MiniZincGrammarParser.SolveContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSolve(MiniZincGrammarParser.SolveContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParameter(MiniZincGrammarParser.ParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParameter(MiniZincGrammarParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#include}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInclude(MiniZincGrammarParser.IncludeContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#include}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInclude(MiniZincGrammarParser.IncludeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#init}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInit(MiniZincGrammarParser.InitContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#init}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInit(MiniZincGrammarParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#predicate}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPredicate(MiniZincGrammarParser.PredicateContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#predicate}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPredicate(MiniZincGrammarParser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#function}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFunction(MiniZincGrammarParser.FunctionContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#function}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFunction(MiniZincGrammarParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterQualName(MiniZincGrammarParser.QualNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitQualName(MiniZincGrammarParser.QualNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#varmark}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVarmark(MiniZincGrammarParser.VarmarkContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#varmark}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVarmark(MiniZincGrammarParser.VarmarkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#extendsmark}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExtendsmark(MiniZincGrammarParser.ExtendsmarkContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#extendsmark}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExtendsmark(MiniZincGrammarParser.ExtendsmarkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#opOrID}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOpOrID(MiniZincGrammarParser.OpOrIDContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#opOrID}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOpOrID(MiniZincGrammarParser.OpOrIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#satisfy}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSatisfy(MiniZincGrammarParser.SatisfyContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#satisfy}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSatisfy(MiniZincGrammarParser.SatisfyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#optimize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOptimize(MiniZincGrammarParser.OptimizeContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#optimize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOptimize(MiniZincGrammarParser.OptimizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#maximize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMaximize(MiniZincGrammarParser.MaximizeContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#maximize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMaximize(MiniZincGrammarParser.MaximizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#minimize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMinimize(MiniZincGrammarParser.MinimizeContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#minimize}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMinimize(MiniZincGrammarParser.MinimizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#annotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotation(MiniZincGrammarParser.AnnotationContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#annotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotation(MiniZincGrammarParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#modeAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterModeAnnotation(MiniZincGrammarParser.ModeAnnotationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#modeAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitModeAnnotation(MiniZincGrammarParser.ModeAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#intS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIntS(MiniZincGrammarParser.IntSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#intS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIntS(MiniZincGrammarParser.IntSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBoolS(MiniZincGrammarParser.BoolSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBoolS(MiniZincGrammarParser.BoolSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSetS(MiniZincGrammarParser.SetSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSetS(MiniZincGrammarParser.SetSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#seqS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSeqS(MiniZincGrammarParser.SeqSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#seqS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSeqS(MiniZincGrammarParser.SeqSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#restS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRestS(MiniZincGrammarParser.RestSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#restS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRestS(MiniZincGrammarParser.RestSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#varchoice}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVarchoice(MiniZincGrammarParser.VarchoiceContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#varchoice}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVarchoice(MiniZincGrammarParser.VarchoiceContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#constrainchoice}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstrainchoice(MiniZincGrammarParser.ConstrainchoiceContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#constrainchoice}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstrainchoice(MiniZincGrammarParser.ConstrainchoiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstr(MiniZincGrammarParser.ConstrContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstr(MiniZincGrammarParser.ConstrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterScons(MiniZincGrammarParser.SconsContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitScons(MiniZincGrammarParser.SconsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTcons(MiniZincGrammarParser.TconsContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTcons(MiniZincGrammarParser.TconsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypename(MiniZincGrammarParser.TypenameContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypename(MiniZincGrammarParser.TypenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typeset}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeset(MiniZincGrammarParser.TypesetContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typeset}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeset(MiniZincGrammarParser.TypesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#vararray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVararray(MiniZincGrammarParser.VararrayContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#vararray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVararray(MiniZincGrammarParser.VararrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#pararray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPararray(MiniZincGrammarParser.PararrayContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#pararray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPararray(MiniZincGrammarParser.PararrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#dimensions}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDimensions(MiniZincGrammarParser.DimensionsContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#dimensions}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDimensions(MiniZincGrammarParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypedata(MiniZincGrammarParser.TypedataContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypedata(MiniZincGrammarParser.TypedataContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExpr(MiniZincGrammarParser.ExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExpr(MiniZincGrammarParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolVal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBoolVal(MiniZincGrammarParser.BoolValContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolVal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBoolVal(MiniZincGrammarParser.BoolValContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#op}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOp(MiniZincGrammarParser.OpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#op}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOp(MiniZincGrammarParser.OpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBoolOp(MiniZincGrammarParser.BoolOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBoolOp(MiniZincGrammarParser.BoolOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArithOp(MiniZincGrammarParser.ArithOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArithOp(MiniZincGrammarParser.ArithOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithOp2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArithOp2(MiniZincGrammarParser.ArithOp2Context ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithOp2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArithOp2(MiniZincGrammarParser.ArithOp2Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualBoolOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterQualBoolOp(MiniZincGrammarParser.QualBoolOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualBoolOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitQualBoolOp(MiniZincGrammarParser.QualBoolOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualArithOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterQualArithOp(MiniZincGrammarParser.QualArithOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualArithOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitQualArithOp(MiniZincGrammarParser.QualArithOpContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#boolComplexExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBoolComplexExpr(MiniZincGrammarParser.BoolComplexExprContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#boolComplexExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBoolComplexExpr(MiniZincGrammarParser.BoolComplexExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBoolExpr(MiniZincGrammarParser.BoolExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBoolExpr(MiniZincGrammarParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#operand}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOperand(MiniZincGrammarParser.OperandContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#operand}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOperand(MiniZincGrammarParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualified}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterQualified(MiniZincGrammarParser.QualifiedContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualified}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitQualified(MiniZincGrammarParser.QualifiedContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#arithComplexExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArithComplexExpr(MiniZincGrammarParser.ArithComplexExprContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#arithComplexExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArithComplexExpr(MiniZincGrammarParser.ArithComplexExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArithExpr(MiniZincGrammarParser.ArithExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArithExpr(MiniZincGrammarParser.ArithExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNotExpr(MiniZincGrammarParser.NotExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNotExpr(MiniZincGrammarParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMinusExpr(MiniZincGrammarParser.MinusExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMinusExpr(MiniZincGrammarParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPredOrUnionExpr(MiniZincGrammarParser.PredOrUnionExprContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPredOrUnionExpr(MiniZincGrammarParser.PredOrUnionExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#onesection}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOnesection(MiniZincGrammarParser.OnesectionContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#onesection}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOnesection(MiniZincGrammarParser.OnesectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#twosections}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTwosections(MiniZincGrammarParser.TwosectionsContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#twosections}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTwosections(MiniZincGrammarParser.TwosectionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRbracketExpr(MiniZincGrammarParser.RbracketExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRbracketExpr(MiniZincGrammarParser.RbracketExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIdexpr(MiniZincGrammarParser.IdexprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIdexpr(MiniZincGrammarParser.IdexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStringExpr(MiniZincGrammarParser.StringExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStringExpr(MiniZincGrammarParser.StringExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#infixOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInfixOp(MiniZincGrammarParser.InfixOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#infixOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInfixOp(MiniZincGrammarParser.InfixOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#infixSetOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInfixSetOp(MiniZincGrammarParser.InfixSetOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#infixSetOp}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInfixSetOp(MiniZincGrammarParser.InfixSetOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arrayaccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayaccess(MiniZincGrammarParser.ArrayaccessContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arrayaccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayaccess(MiniZincGrammarParser.ArrayaccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#caseExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCaseExpr(MiniZincGrammarParser.CaseExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#caseExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCaseExpr(MiniZincGrammarParser.CaseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#caseBranch}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCaseBranch(MiniZincGrammarParser.CaseBranchContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#caseBranch}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCaseBranch(MiniZincGrammarParser.CaseBranchContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#listExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterListExpr(MiniZincGrammarParser.ListExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#listExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitListExpr(MiniZincGrammarParser.ListExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#oneDimList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOneDimList(MiniZincGrammarParser.OneDimListContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#oneDimList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOneDimList(MiniZincGrammarParser.OneDimListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#simpleList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSimpleList(MiniZincGrammarParser.SimpleListContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#simpleList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSimpleList(MiniZincGrammarParser.SimpleListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#simpleNonEmptyList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSimpleNonEmptyList(MiniZincGrammarParser.SimpleNonEmptyListContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#simpleNonEmptyList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSimpleNonEmptyList(MiniZincGrammarParser.SimpleNonEmptyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guardedList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGuardedList(MiniZincGrammarParser.GuardedListContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guardedList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGuardedList(MiniZincGrammarParser.GuardedListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#multiDimList}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMultiDimList(MiniZincGrammarParser.MultiDimListContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#multiDimList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMultiDimList(MiniZincGrammarParser.MultiDimListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link MiniZincGrammarParser#nonEmptyListElems}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNonEmptyListElems(MiniZincGrammarParser.NonEmptyListElemsContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link MiniZincGrammarParser#nonEmptyListElems}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNonEmptyListElems(MiniZincGrammarParser.NonEmptyListElemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#listValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterListValue(MiniZincGrammarParser.ListValueContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#listValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitListValue(MiniZincGrammarParser.ListValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#inDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInDecl(MiniZincGrammarParser.InDeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#inDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInDecl(MiniZincGrammarParser.InDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#whereCond}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterWhereCond(MiniZincGrammarParser.WhereCondContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#whereCond}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitWhereCond(MiniZincGrammarParser.WhereCondContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#letExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLetExpr(MiniZincGrammarParser.LetExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#letExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLetExpr(MiniZincGrammarParser.LetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#letDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLetDecl(MiniZincGrammarParser.LetDeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#letDecl}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLetDecl(MiniZincGrammarParser.LetDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#ifExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIfExpr(MiniZincGrammarParser.IfExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#ifExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIfExpr(MiniZincGrammarParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#bodyIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBodyIf(MiniZincGrammarParser.BodyIfContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#bodyIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBodyIf(MiniZincGrammarParser.BodyIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#elseS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElseS(MiniZincGrammarParser.ElseSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#elseS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElseS(MiniZincGrammarParser.ElseSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#elseifS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElseifS(MiniZincGrammarParser.ElseifSContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#elseifS}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElseifS(MiniZincGrammarParser.ElseifSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setVal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSetVal(MiniZincGrammarParser.SetValContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setVal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSetVal(MiniZincGrammarParser.SetValContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSetExpr(MiniZincGrammarParser.SetExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSetExpr(MiniZincGrammarParser.SetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#bracketExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBracketExpr(MiniZincGrammarParser.BracketExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#bracketExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBracketExpr(MiniZincGrammarParser.BracketExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guardedSet}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGuardedSet(MiniZincGrammarParser.GuardedSetContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guardedSet}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGuardedSet(MiniZincGrammarParser.GuardedSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#commaList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCommaList(MiniZincGrammarParser.CommaListContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#commaList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCommaList(MiniZincGrammarParser.CommaListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guard}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGuard(MiniZincGrammarParser.GuardContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guard}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGuard(MiniZincGrammarParser.GuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRange(MiniZincGrammarParser.RangeContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRange(MiniZincGrammarParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFromR(MiniZincGrammarParser.FromRContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFromR(MiniZincGrammarParser.FromRContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterToR(MiniZincGrammarParser.ToRContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitToR(MiniZincGrammarParser.ToRContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRint(MiniZincGrammarParser.RintContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRint(MiniZincGrammarParser.RintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRfloat(MiniZincGrammarParser.RfloatContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRfloat(MiniZincGrammarParser.RfloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRbool(MiniZincGrammarParser.RboolContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRbool(MiniZincGrammarParser.RboolContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#integer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInteger(MiniZincGrammarParser.IntegerContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#integer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInteger(MiniZincGrammarParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#real}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterReal(MiniZincGrammarParser.RealContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#real}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitReal(MiniZincGrammarParser.RealContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterString(MiniZincGrammarParser.StringContext ctx);

	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitString(MiniZincGrammarParser.StringContext ctx);
}