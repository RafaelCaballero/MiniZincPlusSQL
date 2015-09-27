/**
 * 
 */
package transformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

import logger.AreaAppender;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.mznmodel.MiniZincSQLModel;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Table;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeSet;
import model.connection.SQLConnector;
import model.queries.Query;
import model.relation.ColumnMeta;
import model.relation.Database;
import model.relation.Relation;

/**
 * Replaces tuple variables by individual variables
 * 
 * @author rafa
 *
 *
 */
public class EliminateTupleVariables implements ExprTransformer {
	private static final Logger logger = AreaAppender.getLogger(EliminateTupleVariables.class);

	/**
	 * The substitution is represented by a binding.
	 */
	// protected HashMap<String, Expr> binding;

	/**
	 * The model to be modified
	 */
	protected MiniZincSQLModel mp;

	protected SQLConnector connector;

	protected Database db;

	protected boolean aborted;

	/**
	 * Creates a constructor that initializes the binding associated to the
	 * substitution.
	 * 
	 * @param decls
	 * @param largs
	 */
	/*
	 * public EliminateTupleVariables(List<Decl> decls, List<Expr> largs) {
	 * String name; // the name of the variable in decl Decl decl; // the
	 * parameter declaration Expr expr; // the expression to bind the parameter
	 * 
	 * // build the bind, one by one for (int i = 0; i < decls.size(); i++) {
	 * decl = decls.get(i); expr = largs.get(i); name = decl.getID().print();
	 * put(name, expr);
	 * 
	 * }
	 * 
	 * }
	 */
	/**
	 * Constructor
	 * 
	 * @param db
	 * @param connector
	 */
	public EliminateTupleVariables(MiniZincSQLModel mp, SQLConnector connector, Database db) {
		// this.binding = null;
		this.mp = mp;
		this.connector = connector;
		this.db = db;
		this.aborted = false;

		apply();
	}

	/**
	 * Apply the transformation
	 */
	private void apply() {
		String name; // the name of the variable in decl
		Decl decl; // the parameter declaration

		List<Decl> decls = mp.getDecl();
		// build the bind, one by one
		for (int i = 0; i < decls.size(); i++) {
			decl = decls.get(i);
			// at the moment params of type tuple are not supported
			if (decl instanceof VarDecl) {

				name = decl.getID().print();
				Type type = decl.getDeclType();
				logger.trace("Type: {} Name: {} ", type.toString(), name);

				replaceTupleVar(i, type, name);
			}

		}

	}

	/**
	 * Replaces the i-th variable declaration, if its a tuple,
	 * by tbe jndividual components of its corresponding table
	 * @param i: position of the declaration analyzed in the list decls of the model
	 * @param type: type defining the declaration
	 * @param name: name of the variable
	 */
	private void replaceTupleVar(int i, Type type, String name) {
		if (type instanceof TypeID) {
			ColumnMeta[] replacement = checkType((TypeID) type);
			if (replacement != null) {
				for (ColumnMeta cm : replacement) {

				}

			}
		}

		if (type instanceof TypeArray) {
			TypeArray ta = (TypeArray) type;
			Type base = ta.getBase();
			if (base instanceof TypeID) {
				ColumnMeta[] replacement = checkType((TypeID) base);
				if (replacement != null) {
					for (ColumnMeta cm : replacement) {

					}

				}
			}

		}

		if (type instanceof TypeSet) {
			TypeSet ts = (TypeSet) type;
			Type elem = ts.getElem();
			if (elem instanceof TypeID) {
				ColumnMeta[] replacement = checkType((TypeID) elem);
				if (replacement != null) {
					for (ColumnMeta cm : replacement) {

					}

				}
			}
		}

	}

	/**
	 * Check if the type is a table type. In this case returns the types of the
	 * table attributes
	 * 
	 * @param type
	 * @return
	 */
	private ColumnMeta[] checkType(TypeID type) {
		ColumnMeta[] r = null;
		ID id = type.getId();
		Table t = this.mp.getTableByName(id.print());
		if (t != null) {
			String sqlName = t.getString().print();
			sqlName = sqlName.substring(1, sqlName.length() - 1);
			Relation rel = db.getRelation(sqlName);
			if (rel == null) {
				logger.error("Declared SQL table {} does not exist!", sqlName);
				aborted = true;
			} else {
				try {
					r = Query.getColumns(connector.getConnection(), sqlName);
				} catch (SQLException e) {
					logger.error("Error getting column metada for table {}", sqlName);

				}
			}

		} else {
			logger.error("Type table {} used in var. declaration needs to be declared with the reserved word table!",
					type);
			aborted = true;
		}

		return r;
	}

	/**
	 * A new binding (name, expr).
	 * 
	 * @param name
	 *            String with the variable name.
	 * @param expr
	 *            Value
	 */
	/*
	 * public void put(String name, Expr expr) { if (binding == null) binding =
	 * new HashMap<String, Expr>(); binding.put(name, expr); }
	 */

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
		return r;
	}

	@Override
	public String toString() {
		String r = "";
		return r;
	}

	public boolean aborted() {

		return aborted;
	}

}
