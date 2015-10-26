/**
 * 
 */
package minizinc.representation.mznmodel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import antlr4.MiniZincGrammarParser.ModelContext;
import antlr4.MiniZincGrammarParser.StatContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.statement.*;
import minizinc.representation.statement.decls.ParDecl;
import minizinc.representation.statement.decls.VarDecl;

/**
 * Represents a model where the different statements are in different attributes
 * 
 * @author rafa
 *
 */
public class MiniZincSQLModel extends MznModel {
	protected List<Comment> comment;
	protected List<Table> table;
	protected List<Constraint> constraint;
	protected List<Decl> decl;
	protected List<Function> function;
	protected List<Include> include;
	protected List<Init> init;
	protected List<Output> output;
	protected List<Predicate> predicate;
	protected List<Solve> solve;

	/**
	 * Copy constructor
	 * @param model Model to be copied
	 */
	/* TODO
	public MiniZincSQLModel(MiniZincSQLModel model) {
		int ncomment = model.comment.size();
		this.comment = 
		this.table = table;
		this.constraint = constraint;
		this.decl = decl;
		this.function = function;
		this.include = include;
		this.init = init;
		this.output = output;
		this.predicate = predicate;
		this.solve = solve;
		// this.comment = new ArrayList<Comment>();
	}
	*/
	
	/* TODO
	private <T> List<T> clone(List<T> input) {
		 List<T> result=null;
		 if (input!=null && input.size()>0) {
			 result = new ArrayList<T>(input.size());
			 for(T e:input) {
				 result.add(e.clone());
			 }
		 }
		 
		 return result;
	}
	*/
	/**
	 * complete constructor
	 */
	public MiniZincSQLModel(List<Comment> comment, List<Table> table, List<Constraint> constraint, List<Decl> decl,
			List<Function> function, List<Include> include, List<Init> init, List<Output> output,
			List<Predicate> predicate, List<Solve> solve) {
		this.comment = comment;
		this.table = table;
		this.constraint = constraint;
		this.decl = decl;
		this.function = function;
		this.include = include;
		this.init = init;
		this.output = output;
		this.predicate = predicate;
		this.solve = solve;
		// this.comment = new ArrayList<Comment>();
	}

	public MiniZincSQLModel() {
		table = new ArrayList<Table>();
		constraint = new ArrayList<Constraint>();
		decl = new ArrayList<Decl>();
		function = new ArrayList<Function>();
		include = new ArrayList<Include>();
		init = new ArrayList<Init>();
		output = new ArrayList<Output>();
		predicate = new ArrayList<Predicate>();
		solve = new ArrayList<Solve>();
		comment = new ArrayList<Comment>();
	}

	public void add(Statement s) {
		if (s instanceof Table)
			addTable((Table) s);
		else if (s instanceof Constraint)
			addConstraint((Constraint) s);
		else if (s instanceof Decl)
			addDecl((Decl) s);
		else if (s instanceof Function)
			addFunction((Function) s);
		else if (s instanceof Predicate)
			addPredicate((Predicate) s);
		else if (s instanceof Include)
			addInclude((Include) s);
		else if (s instanceof Init)
			addInit((Init) s);
		else if (s instanceof Output)
			addOutput((Output) s);
		else if (s instanceof Solve)
			addSolve((Solve) s);
		else if (s instanceof Comment)
			addComment((Comment) s);
		else
			Parsing.error("Unexpected statatement " + s.print());

	}

	private void addComment(Comment s) {
		this.comment.add(s);

	}

	public void addTable(Table s) {
		this.table.add(s);

	}

	public void addConstraint(Constraint cte) {
		this.constraint.add(cte);
	}

	public void addDecl(Decl sta) {
		this.decl.add(sta);
	}

	public void addFunction(Function sta) {
		this.function.add(sta);
	}

	public void addPredicate(Predicate sta) {
		this.predicate.add(sta);
	}

	public void addInclude(Include sta) {
		this.include.add(sta);
	}

	public void addInit(Init sta) {
		this.init.add(sta);
	}

	public void addOutput(Output sta) {
		this.output.add(sta);
	}

	public void addSolve(Solve sta) {
		this.solve.add(sta);
	}

	@Override
	public String print() {
		String s = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		s += new Comment("MiniZinc Model parsed using Antlr4");
		s += new Comment("Rafael Caballero " + dateFormat.format(cal.getTime()) + "2015\n\n\n");

		s += printStatements("", comment);

		s += printStatements("Include Section", include);
		s += printStatements("Table Section", table);
		s += printStatements("Declarations Section", decl);
		s += printStatements("Init Section", init);
		s += printStatements("Predicates Section", predicate);
		s += printStatements("Functions Section", function);
		s += printStatements("Constraints Section", constraint);
		s += printStatements("Solve Section", solve);
		s += printStatements("Output Section", output);
		return s;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public List<Constraint> getConstraint() {
		return constraint;
	}

	public List<Decl> getDecl() {
		return decl;
	}

	public List<Function> getFunction() {
		return function;
	}

	public List<Include> getInclude() {
		return include;
	}

	public List<Init> getInit() {
		return init;
	}

	public List<Output> getOutput() {
		return output;
	}

	public List<Table> getTable() {
		return table;
	}

	/**
	 * @return List of predicates in this model
	 */
	public List<Predicate> getPredicate() {
		return predicate;
	}

	public List<Solve> getSolve() {
		return solve;
	}

	/**
	 * Parses a model.<br>
	 * Grammar: model: (stat ';')+;
	 * 
	 * @param ctx
	 *            parsing context.
	 * @return A {@link BasicModel} object representing the MiniZinc model
	 */
	public static MiniZincSQLModel model(ModelContext ctx) {
		MiniZincSQLModel m = new MiniZincSQLModel();
		// add the statements that form the model
		Statement s = null;
		for (StatContext sta : ctx.stat()) {
			s = Statement.statement(sta);
			m.add(s);
		}

		return m;
	}

	public boolean containsTables() {
		boolean r = table != null && table.size() > 0;
		return r;
	}

	@Override
	public MiniZincSQLModel clone() {
		MiniZincSQLModel r = null;
		List<Table> tablep = null;
		List<Constraint> constraintp = null;
		List<Decl> declp = null;
		List<Function> functionp = null;
		List<Include> includep = null;
		List<Init> initp = null;
		List<Output> outputp = null;
		List<Predicate> predicatep = null;
		List<Solve> solvep = null;
		List<Comment> commentp = null;

		if (comment != null) {
			commentp = new ArrayList<Comment>();
			for (Comment x : comment)
				commentp.add(x.clone());
		}

		if (table != null) {
			tablep = new ArrayList<Table>();
			for (Table x : table)
				tablep.add(x.clone());
		}

		if (constraint != null) {
			constraintp = new ArrayList<Constraint>();
			for (Constraint x : constraint)
				constraintp.add(x.clone());
		}
		if (decl != null) {
			declp = new ArrayList<Decl>();
			for (Decl x : decl)
				declp.add(x.clone());
		}
		if (function != null) {
			functionp = new ArrayList<Function>();
			for (Function x : function)
				functionp.add(x.clone());
		}
		if (include != null) {
			includep = new ArrayList<Include>();
			for (Include x : include)
				includep.add(x.clone());
		}
		if (init != null) {
			initp = new ArrayList<Init>();
			for (Init x : init)
				initp.add(x.clone());
		}
		if (output != null) {
			outputp = new ArrayList<Output>();
			for (Output x : output)
				outputp.add(x.clone());
		}
		if (predicate != null) {
			predicatep = new ArrayList<Predicate>();
			for (Predicate x : predicate)
				predicatep.add(x.clone());
		}
		if (solve != null) {
			solvep = new ArrayList<Solve>();
			for (Solve x : solve)
				solvep.add(x.clone());
		}
		r = new MiniZincSQLModel(commentp, tablep, constraintp, declp, functionp, includep, initp, outputp, predicatep,
				solvep);
		return r;
	}

	/**
	 * Initializations are removed and transformed into equality constraints
	 */
	@Deprecated
	public void initsToConstraints() {
		if (init != null && init.size() > 0)
			for (Init x : init) {
				InfixOp op = new InfixOp("=");
				Expr id = x.getID();
				Expr expr2 = x.getExpr();
				InfixExpr ie = new InfixExpr(op, id, expr2);
				Constraint c = new Constraint(ie);
				constraint.add(0, c);
			}

		// all the inits are already constraints. Remove them.
		init.clear();
	}

	@Override
	public Table getTableByName(String tablename) {
		Table r = null;
		if (table != null)
			for (Table t : table) {
				if (t.getId().print().equals(tablename))
					r = t;
			}
		return r;
	}

	/**
	 * Returns a predicate declaration given its name
	 * 
	 * @param name
	 *            Name of the predicate as a String
	 * @return The predicate declaration or null if it does not exist
	 */
	public Predicate getPredicateByName(String name) {
		Predicate r = null;
		int pos = getPredicatePosByName(name);
		if (pos != -1)
			r = predicate.get(pos);

		return r;
	}

	/**
	 * Given the name of a predicate returns its position in the list of
	 * predicates.
	 * 
	 * @param name
	 *            Name of the predicate as a String
	 * @return The predicate position or -1 if it does not exist
	 */
	public int getPredicatePosByName(String name) {
		int r = -1;
		if (predicate != null) {
			for (int i = 0; i < predicate.size() && r == -1; i++) {
				String s = predicate.get(i).getQualName().print();
				if (s.equals(name))
					r = i;
			}

		}

		return r;

	}

	/**
	 * Given the name of a function returns its position in the list of
	 * functions
	 * 
	 * @param name
	 *            Name of the function as a String
	 * @return The function position or -1 if it does not exist
	 */
	public int getFunctionPosByName(String name) {
		int r = -1;
		if (function != null) {
			for (int i = 0; i < function.size() && r == -1; i++) {
				String s = function.get(i).getName().print();
				if (s.equals(name))
					r = i;
			}

		}

		return r;

	}

	/**
	 * Returns a function declaration given its name
	 * 
	 * @param name
	 *            Name of the function as a String
	 * @return The function declaration or null if it does not exist
	 */
	public Function getFunctionByName(String name) {
		Function r = null;
		if (function != null) {
			int pos = getFunctionPosByName(name);
			if (pos != -1)
				r = function.get(pos);
		}

		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
		result = prime * result + ((table == null) ? 0 : table.hashCode());
		result = prime * result + ((decl == null) ? 0 : decl.hashCode());
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + ((include == null) ? 0 : include.hashCode());
		result = prime * result + ((init == null) ? 0 : init.hashCode());
		result = prime * result + ((output == null) ? 0 : output.hashCode());
		result = prime * result + ((predicate == null) ? 0 : predicate.hashCode());
		result = prime * result + ((solve == null) ? 0 : solve.hashCode());
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
		MiniZincSQLModel other = (MiniZincSQLModel) obj;
		if (constraint == null) {
			if (other.constraint != null)
				return false;
		} else if (!constraint.equals(other.constraint))
			return false;
		if (table == null) {
			if (other.table != null)
				return false;
		} else if (!table.equals(other.table))
			return false;
		if (decl == null) {
			if (other.decl != null)
				return false;
		} else if (!decl.equals(other.decl))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (include == null) {
			if (other.include != null)
				return false;
		} else if (!include.equals(other.include))
			return false;
		if (init == null) {
			if (other.init != null)
				return false;
		} else if (!init.equals(other.init))
			return false;
		if (output == null) {
			if (other.output != null)
				return false;
		} else if (!output.equals(other.output))
			return false;
		if (predicate == null) {
			if (other.predicate != null)
				return false;
		} else if (!predicate.equals(other.predicate))
			return false;
		if (solve == null) {
			if (other.solve != null)
				return false;
		} else if (!solve.equals(other.solve))
			return false;
		return true;
	}

	/**
	 * Obtains a variable declaration given its identifier.
	 * 
	 * @param id
	 *            The identifier.
	 * @return The variable declaration, or null if the identifier does not
	 *         correspond to a variable
	 */
	public VarDecl getVarByName(ID id) {
		VarDecl r = null;
		for (Decl d : this.decl)
			if (d instanceof VarDecl && d.getID().equals(id)) {
				r = (VarDecl) d;
				break;
			}

		return r;
	}

	/**
	 * Obtains a declaration given its identifier.
	 * 
	 * @param id
	 *            The identifier.
	 * @return The declaration, or null if the identifier does not correspond to
	 *         a variable
	 */
	public ParDecl getParDeclByName(ID id) {
		ParDecl r = null;
		for (Decl d : this.decl)
			if (d instanceof ParDecl && d.getID().equals(id)) {
				r = (ParDecl) d;
				break;
			}

		return r;
	}

	/**
	 * Removes the variable declaration, if exists
	 * 
	 * @param v
	 *            A variable declaration
	 * @return true if the variable existed
	 */
	public boolean removeVarDecl(VarDecl v) {
		boolean r = false;
		if (decl != null && v != null)
			for (int i = 0; !r && i < this.decl.size(); i++) {
				Decl d = decl.get(i);
				if (d instanceof VarDecl && d.getID().equals(v.getID())) {
					decl.remove(i);
					r = true;
				}
			}
		return r;
	}

	@Override
	public String toString() {
		String r = "";
		r += printStatements("Includes", include);
		r += printStatements("Initializations", init);
		r += printStatements("SQL table declarations", table);
		r += printStatements("Var.and param declarations", decl);
		r += printStatements("User functions", function);
		r += printStatements("User predicates", predicate);
		r += printStatements("Constraints", constraint);
		r += printStatements("Solve statement", solve);
		r += printStatements("output statement", output);
		return r;
	}

	public void emptyTables() {
		table = null;
		
	}
}
