package model;

import java.io.IOException;
import java.sql.SQLException;

import org.slf4j.Logger;

import conf.AppConf;
import control.MiniZincPlusModel;
import gui.MainFrame;
import logger.AreaAppender;
import model.connection.ConnectionData;
import model.connection.SQLConnector;
import model.relation.Database;

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
	 * @param fileName
	 * @throws Exception 
	 */
	public MiniZincPlusModel process(String fileName) throws Exception {
		MiniZincPlusModel mp = new MiniZincPlusModel(fileName);  
		return mp;
		
	}

}
