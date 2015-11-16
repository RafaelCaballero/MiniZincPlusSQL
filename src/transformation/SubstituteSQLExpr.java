package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IdArrayAccess;
import minizinc.representation.expressions.InDecl;
import minizinc.representation.expressions.InfixArithBoolExpr;
import minizinc.representation.expressions.LetDecl;
import minizinc.representation.expressions.LetExpr;
import minizinc.representation.expressions.PredicateCall;
import minizinc.representation.expressions.sets.RangeSetVal;
import minizinc.representation.expressions.sets.SetExpr;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Rbool;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;
import minizinc.representation.types.TypeRange;

/**
 * Collects the names all the let variables that occur in an expression
 * 
 * @author rafa
 */
public class SubstituteSQLExpr implements ExprTransformer {
	private HashMap<String, Expr> cache = new HashMap<String, Expr>();
	private HashMap<String, VarDecl> newVars = new HashMap<String, VarDecl>();
	private HashSet<String> purevars;
	private List<InDecl> contextVars;
	private List<Decl> decls;

	/**
	 * Creates a transformer for the second phase; replacing the non-minizinc
	 * constraints
	 * 
	 * @param lvar
	 *            Lists of pure vars
	 */
	public SubstituteSQLExpr(List<VarDecl> lvar, List<Decl> decls) {
		init(lvar, decls);
	}

	private void init(List<VarDecl> lvar, List<Decl> decls) {
		this.decls = decls;
		cache = new HashMap<String, Expr>();
		newVars = new HashMap<String, VarDecl>();
		purevars = new HashSet<String>();
		contextVars = new ArrayList<InDecl>();
		for (VarDecl v : lvar)
			this.purevars.add(v.getID().print());

	}

	public HashMap<String, Expr> getCache() {
		return cache;
	}

	@Override
	public Expr transform(Expr input) {
		Expr result = null;
		if (input != null && (input instanceof PredicateCall || input instanceof InfixArithBoolExpr) ) {
			PredicateCall pc = input instanceof PredicateCall ? (PredicateCall) input : null;
			InfixArithBoolExpr infix = input instanceof InfixArithBoolExpr ? (InfixArithBoolExpr) input : null;
			String id = pc != null ? pc.getId().print() : infix.getOp();

			if (id.equals("forall") || id.equals("exists") || id.equals("product") || id.equals("sum")) {
				// copy the context vars
				List<InDecl> contextVarsCopy = new ArrayList<InDecl>();
				int sizeVars = newVars.size();
				contextVarsCopy.addAll(contextVars);

				contextVars.addAll(pc.getLindecl());
				// apply the transformer to all the arguments
				List<Expr> args = pc.getArgs();
				List<Expr> lresult = input.applyTransformerList(this, args);

				// if there are new variables in the list
				if (newVars.size() != sizeVars)
					result = new PredicateCall(pc.getId(), lresult);

				// in any case restore the array
				contextVars.clear();
				contextVars.addAll(contextVarsCopy);

			} else {
				ContainsPureSQL contains = new ContainsPureSQL(purevars);
				
				if (id.equals("/\\") || id.equals("\\/") || id.equals("->")) {
					// check if any argument contains a pure SQL variable
					
					List<Expr> lexpr = null;
					if (pc!=null)
					   lexpr = pc.getArgs();
					else {
					    lexpr = new ArrayList<Expr>();
					    lexpr.add(infix.getE1());
					    lexpr.add(infix.getE2());
					}
					input.applyTransformerList(contains, lexpr);

				} else {
					// check if the expression contains a pure SQL variable
					input.applyTransformer(contains, input);
				}
				
				if (contains.getPureVar()) {
					String varName = addVar(pc,infix);
					List<Expr> indices = new ArrayList<Expr>();
					for (InDecl indecl:contextVars) {
						indices.addAll(indecl.getGuard());
					}
					input = new IdArrayAccess(new ID(varName),indices);
				}


			} 

		}

		// return the new input
		return input;
	}
	
	/**
	 * Generate a new variable
	 * Only one among pc and infix must be not null
	 * @param pc Is a predicate call
	 * @param infix Is an infix expression
	 */
	private String addVar(PredicateCall pc, InfixArithBoolExpr infix) {
		// new variable name
		String varName = generateNewVar();
		ID newVar = new ID(varName);
		// obtain the type
		Type type = newVarType(contextVars,pc,infix);
		// declare the variable
		VarDecl  v = new VarDecl(type,newVar);
		newVars.put(varName, v);
		return varName;

	}

	private Type newVarType(List<InDecl> contextVars2, PredicateCall pc, InfixArithBoolExpr infix) {
		Type result=null;
		if (contextVars!=null && contextVars.size()>0) {
			List<Type> lt = new ArrayList<Type>();
			for (InDecl inDecl:contextVars) {
				SetExpr setExpr = inDecl.getSetExpr();
				if (setExpr instanceof RangeSetVal) {
					RangeSetVal rsv = (RangeSetVal) setExpr;
					ArithExpr from = rsv.getFrom();
					ArithExpr to = rsv.getTo();	
					TypeRange range = new TypeRange(from,to);
					lt.add(range);
				}
			 result = new TypeArray(lt,new Rbool());
			}
		} else {
			result = new Rbool();
		}
		return result;
	}

	private String generateNewVar() {
		int i = 0;
		String name = "b" + i;
		boolean found = false;
		do {

			int j = 0;
			while (!found && decls != null && j < decls.size()) {
				String s = decls.get(j).getID().print();
				if (name.equals(s))
					found = true;
				j++;
			}
			i++;

		} while (found);

		return name;
	}
}
