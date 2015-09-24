package model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import model.queries.Query;
import model.relation.Database;

/**
 * A SQL connection
 * 
 * @author rafa
 *
 */
public class SQLConnector {
	private Connection conn = null;
	private ConnectionData cData;

	/**
	 * Starts a connection. If the connection was open it is closed first using
	 * disconnect.
	 * 
	 * @param cData
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void connect(ConnectionData cData)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		if (conn != null)
			disconnect();

		this.cData = cData;

		Class.forName("org.postgresql.Driver").newInstance();

		String url = cData.getUrl() + cData.getDbName();
		Properties props = cData.getProps();
		if (props.getProperty("ssl").equals("true"))
			conn = DriverManager.getConnection(url, props);
		else {
			String user = props.getProperty("user");
			String passwd = props.getProperty("password");
			conn = DriverManager.getConnection(url, user, passwd);
		}

	}

	/**
	 * Closes the SQL connection
	 * 
	 * @return true if the connection was successfully disconnected, or if it
	 *         was already disconnected. False if the disconnection fails
	 */
	public boolean disconnect() {
		boolean result = false;
		if (conn != null)
			try {
				conn.close();
				conn = null;
				result = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		else
			result = true;

		return result;
	}

	/**
	 * Obtains the Datatabase, that is the schemas and for each schema all the
	 * relations
	 * 
	 * 
	 * @return A {@link Database} or null if this is not possible
	 */
	public Database database() {
		Database result = Query.getDatabase(conn, cData);

		return result;
	}

	public ConnectionData getcData() {
		return cData;
	}

	public Connection getConnection() {
		return conn;
	}
}