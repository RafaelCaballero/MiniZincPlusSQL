package minizinc.representation.mznmodel;

import java.util.List;

import transformation.ExprTransformer;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.statement.Comment;
import minizinc.representation.statement.Statement;
import minizinc.representation.statement.Table;

public abstract class MznModel implements MiniZincRepresentation, Cloneable {
	public abstract MznModel clone();

	public abstract boolean containsTables();

	/**
	 * Adds a new statement to the model.
	 * 
	 * @param s
	 *            The statement to be included in the model.
	 */
	public abstract void add(Statement s);

	/**
	 * Returns a table definition given its name.
	 * 
	 * @param tablename
	 *            Name of the table
	 * @return The table definition or null if it is not found
	 */
	public abstract Table getTableByName(String tablename);

	/**
	 * Applies a {@link ExprTransformer} to all the statements in the list.
	 * 
	 * @param comment
	 *            Comment preceding the print
	 * @param ls
	 *            The list of statements. Can be null or empty
	 * @return if {@link ls} is null or empty, the empty string. Otherwise the
	 *         print of the comment followed by the prints of the elements and a
	 *         "\n".
	 */
	public void applyTransformer(ExprTransformer t, List<? extends Statement> ls) {
		if (ls != null && ls.size() > 0) {
			for (Statement x : ls)
				x.subexpressions(t);
		}

	}

	/**
	 * Returns a String with the concatenation of the print() method applied to
	 * all the elements of the list. This is preceded by the comment indicated
	 * in {@link comment}. If the list is null the string will be ""
	 * 
	 * @param comment
	 *            Comment preceding the print
	 * @param ls
	 *            The list of statements. Can be null or empty
	 * @return if {@link ls} is null or empty, the empty string. Otherwise the
	 *         print of the comment followed by the prints of the elements and a
	 *         "\n".
	 */
	public String printStatements(String comment, List<? extends Statement> ls) {
		String s = "";
		if (ls != null && ls.size() > 0) {
			s += new Comment(comment);
			for (Statement x : ls)
				s += x.print() + (!(x instanceof Comment) ? ";\n" : "");
			s += "\n";
		}
		return s;
	}

}
