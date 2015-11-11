package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.io.IOException;
import java.sql.SQLException;

import org.slf4j.Logger;

import conf.AppConf;
import control.MiniZincPlusModel;
import logger.AreaAppender;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IdArrayAccess;
import minizinc.representation.expressions.InDecl;
import minizinc.representation.expressions.InfixArithBoolExpr;
import minizinc.representation.expressions.Operand;
import minizinc.representation.expressions.PredicateCall;
import minizinc.representation.expressions.sets.RangeSetVal;
import minizinc.representation.mznmodel.MiniZincSQLModel;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Rbool;
import minizinc.representation.types.Rfloat;
import minizinc.representation.types.Rint;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeRange;
import minizinc.representation.types.TypeSet;
import model.connection.ConnectionData;
import model.connection.SQLConnector;
import model.queries.Query;
import model.queries.RelationMinAndMax;
import model.relation.Database;
import transformation.SubstituteSQLExpr;
import transformation.Substitution;
import transformation.preprocess.EliminateTupleVariables;
import transformation.preprocess.PreprocessResult;
import transformation.preprocess.Replacement;

public class Model {

	private static final Logger logger = AreaAppender.getLogger(Model.class);

	/**
	 * Database connection
	 */
	SQLConnector connector = null;
	/**
	 * Active database
	 */
	Database db = null;

	/**
	 * Starts a database connection
	 * 
	 * @param cData
	 * 
	 * @return true if the connection was possible, false otherwise
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean connect(ConnectionData cData) throws ClassNotFoundException, SQLException {
		boolean result = false;

		try {
			connector = new SQLConnector();
			connector.connect(cData);
			db = connector.database();
			result = db != null;
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("Error during connection!" + e.getStackTrace());
			// e.printStackTrace();
		}
		return result;
	}

	/**
	 * Ends a database connection
	 * 
	 * @return true if the disconnection was possible, false otherwise
	 */
	public boolean disconnect() {
		boolean result;
		if (connector != null) {
			connector.disconnect();
			connector = null;
			result = true;
		} else
			result = true;

		return result;
	}

	/**
	 * @return The current database as an object of class {@code model.Database}
	 */
	public Database getDB() {

		return db;
	}

	public boolean saveLogin(AppConf conf) throws IOException {
		conf.store();
		return true;

	}

	public boolean isConnected() {
		return connector != null;
	}

	/**
	 * The main work
	 * 
	 * @param fileName
	 * @throws Exception
	 */
	public MiniZincSQLModel process(String fileName) throws Exception {
		MiniZincPlusModel mp = new MiniZincPlusModel(fileName);
		return mp.getModel();

	}

	public EliminateTupleVariables preProcess(MiniZincSQLModel mp) {
		EliminateTupleVariables etv = preProcess(mp, connector, db);

		/**
		 * Show information in the logger
		 *
		 */
		List<Replacement> rs = etv.getReplaced();
		logger.info("\n-----------------");
		logger.info("Preprocessing report: ");
		for (Replacement r : rs) {
			logger.info("Variable {}", r.getDecl().print());
			logger.info("Replaced by:");
			List<VarDecl> newVars = r.getNewDecls();
			List<Boolean> mixed = r.getMixed();
			if (newVars != null) {
				for (int i = 0; i < newVars.size(); i++) {
					logger.info("   - {}. Mixed: {}", newVars.get(i), mixed.get(i) ? "yes" : "no");

				}
			}
			logger.info("Using SQL table {}", r.getSqlName());
		}
		logger.info("-----------------\n");

		return etv;

	}

	private EliminateTupleVariables preProcess(MiniZincSQLModel mp, SQLConnector connector2, Database db2) {
		EliminateTupleVariables etv = new EliminateTupleVariables(mp, connector, db);
		mp.applyTransformer(etv, mp.getInit());
		mp.applyTransformer(etv, mp.getFunction());
		mp.applyTransformer(etv, mp.getPredicate());
		mp.applyTransformer(etv, mp.getConstraint());
		mp.applyTransformer(etv, mp.getSolve());
		mp.applyTransformer(etv, mp.getOutput());

		return etv;

	}

	@Deprecated
	private void thirdPhase() {

	}

	public void secondPhase(PreprocessResult list, MiniZincSQLModel mp, List<VarDecl> lvar) {
		// extract the list of purevars
		HashSet<String> purevars = new HashSet<String>();
		for (VarDecl vDecl : lvar)
			purevars.add(vDecl.getID().print());

		SubstituteSQLExpr transformer = new SubstituteSQLExpr(lvar, mp.getDecl());
		mp.applyTransformer(transformer, mp.getConstraint());

	}

	/**
	 * Changes the type of pure SQL variables to boolean
	 * 
	 * @param list
	 *            List of variables obtained after the preprocessing
	 * @return list of variables that have been changed to boolean
	 */
	/*
	 * private List<ID> changeSQLVarsToBoolean(PreprocessResult list) { List<ID>
	 * result = new ArrayList<ID>(); // process each non-mixed variable if
	 * (list!=null) for (Replacement r:list) { List<VarDecl> vars =
	 * r.getNewDecls(); List<Boolean> mixed = r.getMixed(); for (int i=0;
	 * i<vars.size();i++ ) { if (!mixed.get(i)) { VarDecl var = vars.get(i);
	 * Type type = var.getDeclType(); // change the variable to boolean Rbool
	 * typeBool = new Rbool(); Type newType = null; boolean isTypeArray = type
	 * instanceof TypeArray; boolean isTypeSet = type instanceof TypeSet; if
	 * (isTypeArray) { TypeArray ta = (TypeArray) type; ta.setBase(typeBool);
	 * newType = ta; } else if (isTypeSet) { TypeSet ts = (TypeSet) type;
	 * ts.setElem(typeBool); newType = ts; } else { newType = typeBool; }
	 * 
	 * // change the declaration type var.setDeclType(newType); // a new
	 * variable type has been changed result.add(var.getID());
	 * 
	 * 
	 * } } } return result; }
	 */

	/**
	 * @param list
	 *            List of replacements occurred during pre-processing
	 * @param mp
	 * @return The list of pure variables
	 */
	public List<VarDecl> firstPhase(PreprocessResult list, MiniZincSQLModel mp) {
		List<VarDecl> lvar = new ArrayList<VarDecl>();
		// process each mixed variable
		if (list != null)
			for (Replacement r : list) {
				List<VarDecl> vars = r.getNewDecls();
				List<Boolean> mixed = r.getMixed();
				List<String> colNames = r.getColumnNames();
				String table = r.getSqlName();
				for (int i = 0; i < vars.size(); i++) {
					VarDecl var = vars.get(i);
					if (mixed.get(i)) {
						// only integers and float are used
						String colName = colNames.get(i);
						addConstraints(mp, var, table, colName);
					} else {
						// collect the pure vars
						lvar.add(var);
					}

				} // for
			}

		return lvar;
	}

	/**
	 * New constraints related to the first phase. We have already checked that
	 * the variable is mixed.
	 * 
	 * @param mp
	 *            Model to be modified
	 * @param var
	 *            Variable
	 * @param table
	 *            SQL table
	 * @param colName
	 *            column name in the table
	 */
	private void addConstraints(MiniZincSQLModel mp, VarDecl var, String table, String colName) {
		Type type = var.getDeclType();
		ID varID = var.getID();

		Type elemType = type;
		// boolean isTypeID = type instanceof TypeID;
		boolean isTypeArray = type instanceof TypeArray;
		boolean isTypeSet = type instanceof TypeSet;

		if (isTypeArray) {
			TypeArray ta = (TypeArray) type;
			elemType = ta.getBase();
		}

		if (isTypeSet) {
			TypeSet ts = (TypeSet) type;
			elemType = ts.getElem();
		}

		RelationMinAndMax extremes = null;
		try {
			if (elemType instanceof Rfloat) {
				extremes = Query.getMinAndMaxFloat(this.connector.getConnection(), table, colName);
			}
			if (elemType instanceof Rint) {
				extremes = Query.getMinAndMaxInteger(this.connector.getConnection(), table, colName);

			}
		} catch (SQLException e) {
			logger.error("Error in phase 1: {}, {}", e.getMessage(), e.getStackTrace());
		}
		if (extremes != null)
			generateNewConstraint(mp, type, varID, extremes);

	}

	/**
	 * New constraints obtained from the min and the max values in the SQL table
	 * 
	 * @param mp
	 *            The model
	 * @param type
	 *            The type of the var
	 * @param varID
	 *            Var ID
	 * @param extremes
	 *            maximun and minimun
	 */
	private void generateNewConstraint(MiniZincSQLModel mp, Type type, ID varID, RelationMinAndMax extremes) {

		boolean isTypeArray = type instanceof TypeArray;

		Expr expr;
		if (isTypeArray) {
			generateNewConstraintArray(mp, type, varID, extremes);
		}

		boolean isTypeID = type instanceof TypeID;
		if (isTypeID) {
			And andConstraint = createAnd(new Operand(varID), extremes.max, extremes.min);
			Constraint newConstraint = new Constraint(andConstraint);
			mp.add(newConstraint);

		}

		boolean isFloat = type instanceof Rint || type instanceof Rfloat;
		if (isFloat) {
			And andConstraint = createAnd(new Operand(varID), extremes.max, extremes.min);
			Constraint newConstraint = new Constraint(andConstraint);
			mp.add(newConstraint);

		}

	}

	private And createAnd(Operand value, Operand max, Operand min) {
		And result = null;
		InfixArithBoolExpr e1 = new InfixArithBoolExpr("<=", value, max);
		InfixArithBoolExpr e2 = new InfixArithBoolExpr(">=", value, min);
		result = new And(e1, e2);
		return result;
	}

	private void generateNewConstraintArray(MiniZincSQLModel mp, Type type, ID varID, RelationMinAndMax extremes) {
		TypeArray ta = (TypeArray) type;

		// prepare the (i in ..)
		List<InDecl> lindecl = new ArrayList<InDecl>();
		List<Type> dimensions = ta.getDimensions();
		List<Expr> newIds = new ArrayList<Expr>();
		List<ID> guard = new ArrayList<ID>();
		int i = 0;
		for (Type dim : dimensions) {
			i++;
			// for each dimension a new variable
			if (dim instanceof TypeRange) {
				// just one variable
				ID id = new ID("index_" + varID.print() + "_" + i);
				newIds.add(id);
				guard.add(id);
				TypeRange tr = (TypeRange) dim;
				RangeSetVal rangeSetVal = null;
				if (tr.isFromToRange()) {
					ArithExpr from = tr.getFrom();
					ArithExpr to = tr.getTo();
					rangeSetVal = new RangeSetVal(from, to);
				} else {
					ID theID = tr.getID();
					rangeSetVal = new RangeSetVal(theID);

				}

				InDecl inDecl = new InDecl(guard, rangeSetVal);
				lindecl.add(inDecl);
			} else
				logger.error("Error in first phase. Unexpected dimension type. Variable: {}, Type: {}", varID.print(),
						dim.print());
		}

		// create forall
		// PredOurUnion -> infixBoolExpr
		// -> InfixArithBoolExpr IdArrayAccess IntC >
		List<Expr> args = new ArrayList<Expr>();
		IdArrayAccess aa = new IdArrayAccess(varID, newIds);

		// just one argument: the and of two atomic constraints

		And andExpr = createAnd(new Operand(aa), extremes.max, extremes.min);
		args.add(andExpr);

		Expr expr = new PredicateCall(new ID("forall"), lindecl, args);
		Constraint c = new Constraint(expr);
		mp.addConstraint(c);

	}

}
