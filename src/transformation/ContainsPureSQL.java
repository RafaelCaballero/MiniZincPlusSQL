/**
 * 
 */
package transformation;

import java.util.HashSet;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IdArrayAccess;

/**
 * Represents a substitution of MiniZinc variables by values. Used mainly for
 * unfolding predicates and functions.
 * 
 * @author rafa
 *
 *
 */
public class ContainsPureSQL implements ExprTransformer {

	private HashSet<String> purevars;
	private boolean isPureVar;

	/**
	 * Creates a constructor that initializes the binding associated to the
	 * substitution.
	 */
	public ContainsPureSQL(HashSet<String> purevars) {
		this.purevars = purevars;
		this.isPureVar = false;
	}

	public boolean getPureVar() {
		return this.isPureVar;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see transformation.ExprTransformer#transform(minizinc.representation.
	 * expressions .Expr)
	 */
	/**
	 * Transforms variable into its value according to this substitution.
	 */
	@Override
	public Expr transform(Expr input) {
		Expr r = null;
		if (input != null && (input instanceof IdArrayAccess || input instanceof ID)) {
			ID id = input instanceof ID ? (ID) input : ((IdArrayAccess) input).getID();
			if (purevars.contains(id.print()))
				isPureVar = true;

		}
		return r;
	}

}
