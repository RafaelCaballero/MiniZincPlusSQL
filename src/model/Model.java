package model;

import java.util.List;
import java.io.IOException;
import java.sql.SQLException;

import org.slf4j.Logger;

import conf.AppConf;
import control.MiniZincPlusModel;
import logger.AreaAppender;
import minizinc.representation.mznmodel.MiniZincSQLModel;
import minizinc.representation.statement.decls.VarDecl;
import model.connection.ConnectionData;
import model.connection.SQLConnector;
import model.relation.Database;
import transformation.EliminateTupleVariables;
import transformation.Replacement;

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

	/**
	 * Solver for MiniZincPlus
	 * 
	 * @param mp
	 *            Source model
	 * @param i
	 *            Number of answers in MiniZinc
	 * @param j
	 *            Number of answers in SQL
	 */
	public void solver(MiniZincSQLModel mp, int i, int j) {
		EliminateTupleVariables etv = preProcess(mp, connector, db);
		if (etv.aborted()) {
			logger.error("Preprocess error, aborting...");
		} else {
			
			firstPhase();
			secondPhase();
			thirdPhase();
		}
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
		for (Replacement r:rs){
			logger.info("Variable {}",r.getDecl().print());
			logger.info("Replaced by:");
			List<VarDecl> newVars = r.getNewDecls();
			List<Boolean> mixed = r.getMixed();
			if (newVars!=null) {
				for (int i=0; i<newVars.size(); i++) {
					logger.info("   - {}. Mixed: {}",newVars.get(i),mixed.get(i) ? "yes" : "no");
					
				}
			}
		}
		logger.info("-----------------\n");
		
		return etv;
		
	}
    private EliminateTupleVariables preProcess(MiniZincSQLModel mp, SQLConnector connector2, Database db2){
		EliminateTupleVariables etv = new EliminateTupleVariables(mp, connector, db);
		mp.applyTransformer(etv, mp.getInit());
		mp.applyTransformer(etv, mp.getFunction());
		mp.applyTransformer(etv, mp.getPredicate());
		mp.applyTransformer(etv, mp.getConstraint());
		mp.applyTransformer(etv, mp.getSolve());
		mp.applyTransformer(etv, mp.getOutput());
		
		return etv;

	}
	private void thirdPhase() {

	}

	private void secondPhase() {

	}

	private void firstPhase() {

	}

}
