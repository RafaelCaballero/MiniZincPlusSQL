package minizinc.representation.statement;

import antlr4.MiniZincGrammarParser.TableContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.StringC;
import transformation.ExprTransformer;

public class Table extends Statement {

	private ID id;
	private StringC string;

	public Table(ID id, StringC string) {
		super(TStatement.TABLE);
		this.id = id;
		this.string = string;

	}

	/**
	 * Returns a new Constraint representing the object parsed in ctx.
	 * 
	 * @param ctx
	 *            Parsing context
	 * @return A new Constraint
	 */
	public static Table table(TableContext ctx) {
		Table r = null;
		if (Parsing.has(ctx.string()) && Parsing.hasTerminal(ctx.ID())) {
			r = new Table(ID.IDTerm(ctx.ID()), StringC.stringTerm(ctx.string()));
		}
		return r;
	}

	@Override
	public String print() {

		return "table " + id.print() + " = " + string.print();
	}

	public String toString() {
		return print();
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ID id2 = this.applyTransformer2(t, id);
		StringC string2 = this.applyTransformer2(t, string);
		this.id = id2;
		this.string = string2;

	}

	public ID getId() {
		return id;
	}

	public StringC getString() {
		return string;
	}

	@Override
	public Table clone() {
		Table r = null;
		StringC s2 = string.clone();
		ID id2 = id.clone();
		r = new Table(id2, s2);
		return r;
	}

	public String getTableName() {
		return string.print();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((string == null) ? 0 : string.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table other = (Table) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}

}
