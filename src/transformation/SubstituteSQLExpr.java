package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InDecl;
import minizinc.representation.expressions.LetDecl;
import minizinc.representation.expressions.LetExpr;
import minizinc.representation.expressions.PredicateCall;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.decls.VarDecl;

/**
 * Collects the names all the let variables that occur in an expression
 * 
 * @author rafa
 *
 */
public class SubstituteSQLExpr implements ExprTransformer {
	private HashMap<String, Expr> cache = new HashMap<String, Expr>();
	private HashSet<String> purevars;
	private List<InDecl> contextVars;

	/**
	 * Creates a transformer for the second phase; replacing the non-minizinc constraints
	 * @param lvar Lists of pure vars
	 */
	public SubstituteSQLExpr(List<VarDecl> lvar) {
		init(lvar);
	}

	private void init(List<VarDecl> lvar) {
		cache = new HashMap<String,Expr>();
		purevars = new HashSet<String>();
		contextVars = new ArrayList<InDecl>();
		for (VarDecl v:lvar)
		  this.purevars.add(v.getID().print());
	
		
	}
	public HashMap<String, Expr>  getCache() {
		return cache;
	}
	
	

	@Override
	public Expr transform(Expr input) {

		if (input != null && input instanceof PredicateCall) {
			PredicateCall pc = (PredicateCall) input;
			String id = pc.getId().print();

			if (id.equals("forall") || id.equals("exists") || id.equals("product") || id.equals("sum") ) {
				contextVars.addAll(pc.getLindecl()) ;
			} 
				
			// check if any argument contains a pure SQL variable
			ContainsPureSQL contains = new ContainsPureSQL(purevars);
			List<Expr> lexpr = pc.getArgs();
			input.applyTransformerList(contains, lexpr);
			if (contains.getPureVar()) {
				System.out.println(input.print());
			}
			
			
		}

		// return the same input because this is not really a transformer but a
		// "getter"
		return input;
	}


}
