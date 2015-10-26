package model.queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import logger.AreaAppender;
import minizinc.representation.expressions.FloatC;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.Operand;
import minizinc.representation.types.Rbool;
import minizinc.representation.types.Rfloat;
import minizinc.representation.types.Rint;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import model.connection.ConnectionData;
import model.relation.ColumnMeta;
import model.relation.Database;
import model.relation.Relation;
import model.relation.Table;
import model.relation.View;

/**
 * General queries to the database. Obtaining information about user tables and
 * views. It is assumed that the connection has been established in advance.
 * 
 * @author rafa
 *
 */
public class Query {

	private static final Logger logger = AreaAppender.getLogger(Query.class);

	// system schemata are excluded
	public static List<String> sExcluded = new ArrayList<String>(Arrays.asList("pg_catalog", "information_schema"));

	public static String GETRELATIONS = "select table_name, table_schema from INFORMATION_SCHEMA.tables "; // WHERE
																											//
	public static String GETVIEWCODE = "select definition from pg_views where schemaname=? and viewname = ?";

	public static String GETSEARCHPATH = "SHOW search_path";

	/**
	 * Obtains a list of user defined views
	 * 
	 * @param conn
	 *            The current connection
	 * @return List of Strings with the name of the views.
	 */
	public static List<String> getUserRelationNames(Connection conn) {
		ArrayList<String> la = null;
		if (conn != null) {
			la = new ArrayList<String>();
			// make sure autocommit is off
			try {
				conn.setAutoCommit(false);
				Statement st;

				st = conn.createStatement();
				// Turn use of the cursor on.
				st.setFetchSize(50);
				ResultSet rs = st.executeQuery(Query.GETRELATIONS);
				while (rs.next()) {
					String tname = rs.getString(1);
					String tschema = rs.getString(2);
					if (!sExcluded.contains(tschema))
						la.add(tschema + "." + tname);
				}
				rs.close();
				// Turn the cursor off.
				st.setFetchSize(0);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return la;

	}

	/**
	 * Obtains a list of user defined views
	 * 
	 * @param conn
	 *            The current connection
	 * @return List of Strings with each schema name in the search path
	 */
	public static List<String> getSearchPath(Connection conn) {
		List<String> la = null;
		if (conn != null) {
			// make sure autocommit is off
			try {
				conn.setAutoCommit(false);
				Statement st;

				st = conn.createStatement();
				// Turn use of the cursor on.
				st.setFetchSize(50);
				ResultSet rs = st.executeQuery(Query.GETSEARCHPATH);
				if (rs.next()) {
					String tname = rs.getString(1);
					logger.info("Search path: {} ", tname);

					la = Arrays.asList(tname.split("\\s*,\\s*"));
				}
				rs.close();
				// Turn the cursor off.
				st.setFetchSize(0);

			} catch (SQLException e) {
				logger.error("Error fetching search path");
				e.printStackTrace();
			}

		}
		return la;

	}

	/**
	 * Get the Database object associated to this database. It contains all the
	 * schemas and each schema all its relations
	 * 
	 * @param conn
	 *            SQL Connection
	 * @param cData
	 *            Connection data (user....)
	 * @return Database representation
	 */
	public static Database getDatabase(Connection conn, ConnectionData cData) {
		Database result = null;
		List<String> ls = Query.getUserRelationNames(conn);
		List<String> searchPath = Query.getSearchPath(conn);

		if (conn != null && ls != null && ls.size() > 0) {
			try {

				PreparedStatement st = conn.prepareStatement(GETVIEWCODE);
				result = new Database(searchPath, cData);
				for (String s : ls) {
					int posdot = s.indexOf('.');
					if (posdot == -1) {
						System.out.println("Unexpected table name: " + s);
					} else {
						String schema = s.substring(0, posdot);
						String name = s.substring(posdot + 1);
						// System.out.println("Schema "+schema+" name "+name);
						// put the parameter
						st.setString(1, schema);
						st.setString(2, name);
						ResultSet rs = st.executeQuery();
						// add the new relation to the database
						if (rs.next()) {
							String def = rs.getString(1);
							View view = new View(name, schema, def, conn);
							result.put(schema, view);
						} else {
							Table table = new Table(name, schema, conn);
							result.put(schema, table);
						}

						rs.close();
					}

				}
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * Checks if the two relations have the same resultset
	 * 
	 * @param conn
	 *            The SQL connection
	 * @param t
	 *            First relation
	 * @param r
	 *            Second relation
	 * @param order
	 *            true if the order must be taken into account. Important: at
	 *            the moment only order=false is supported.
	 * @return A explanation of the result. The value contains the result itself
	 *         (true if the two relations are equal or not) and a suitable
	 *         message explaining the reason of the produced result.
	 */
	public static Explanation equalResulSet(Connection conn, Relation t, Relation r, boolean order) {
		Explanation result = null;
		if (order)
			logger.error("Ordered compararison not implemented yet!");
		else
			result = equalResulSetWithoutOrder(conn, t, r);
		return result;
	}

	/**
	 * Checks if the two relations contain the same tuples, disregarding order
	 * but taking into account the number of repetitions SELECT CASE WHEN EXISTS
	 * (TABLE a EXCEPT ALL TABLE b) OR EXISTS (TABLE b EXCEPT ALL TABLE a) THEN
	 * 'different' ELSE 'same' END AS result ;
	 * 
	 * @param conn
	 * @param t
	 * @param r
	 * @return
	 */
	private static Explanation equalResulSetWithoutOrder(Connection conn, Relation t, Relation r) {
		Explanation result = null;

		try {
			conn.setAutoCommit(true);

			Statement stAllr = conn.createStatement();
			Statement stAllt = conn.createStatement();
			ResultSet rsAllr = stAllr.executeQuery("select * from " + r.fullName());
			ResultSet rsAllt = stAllt.executeQuery("select * from " + t.fullName());
			ResultSetMetaData metar = rsAllr.getMetaData();
			ResultSetMetaData metat = rsAllt.getMetaData();

			ColumnMeta arrayMetar[] = getColumnMetas(metar);
			Set<ColumnMeta> cr = new HashSet<ColumnMeta>(Arrays.asList(arrayMetar));
			ColumnMeta arrayMetat[] = getColumnMetas(metat);
			Set<ColumnMeta> ct = new HashSet<ColumnMeta>(Arrays.asList(arrayMetat));

			cr.retainAll(ct);

			if (cr.size() == 0) {
				result = new Explanation(false, true,
						"Error comparing relations " + t.fullName() + " and " + r.fullName() + ": no common columns!");

			} else {
				// create the select
				int ncolumns = cr.size();
				int i = 0;
				String columns = "";
				for (ColumnMeta c : cr) {
					columns += c.getColumnName();
					i++;
					if (i < ncolumns)
						columns += ",";
				}

				String s = "SELECT CASE WHEN EXISTS (select " + columns + " from " + t.fullName()
						+ " EXCEPT ALL select " + columns + " from " + r.fullName() + ")  OR " + "EXISTS (select "
						+ columns + " from " + r.fullName() + " EXCEPT ALL select " + columns + " from " + t.fullName()
						+ ") THEN 'different' ELSE 'equal' END";

				Statement st = conn.createStatement();
				ResultSet rs0 = st.executeQuery(s);
				rs0.next();
				String sresult = rs0.getString(1);
				if (sresult.equals("equal")) {
					result = new Explanation(true,
							"Identical rows, identical number of repetitions (order not considered");
				} else {

					// we can go further
					String s1 = "select count(*) from (select " + columns + " from " + t.fullName()
							+ " EXCEPT ALL select " + columns + " from " + r.fullName() + ") A";
					String s2 = "select count(*) from (select " + columns + " from " + r.fullName()
							+ " EXCEPT ALL select " + columns + " from " + t.fullName() + ") B";
					ResultSet rs1 = st.executeQuery(s1);
					rs1.next();
					Long n1 = rs1.getLong(1);
					ResultSet rs2 = st.executeQuery(s2);
					rs2.next();
					Long n2 = rs2.getLong(1);
					String explain = "";
					// number of rows in t not in r
					if (n1 > 0)
						explain = t.fullName() + " contains " + n1 + " rows not in " + r.fullName();
					// number of rows in r not in t
					if (n2 > 0)
						explain = r.fullName() + " contains " + n2 + " rows not in " + t.fullName();

					result = new Explanation(false, explain);
				}
			}
		} catch (SQLException e) {
			String msg = e.getMessage();
			logger.error("Error comparing relation {} and {}", t.fullName(), r.fullName());
			if (msg.contains("each EXCEPT query must have the same number of columns"))
				result = new Explanation(false, true, "Error comparing relations " + t.fullName() + " and "
						+ r.fullName() + ": different number of columns!");
			else
				result = new Explanation(false, true,
						"Error comparing relations " + t.fullName() + " and " + r.fullName());
		}

		return result;
	}

	/**
	 * Obtain a set with all the columns of a query
	 * 
	 * @param metar
	 *            Result metadata of the query
	 * @return The set containing the columns of the query
	 */
	private static ColumnMeta[] getColumnMetas(ResultSetMetaData metar) {
		int ncolumns;
		ColumnMeta[] result;
		try {
			ncolumns = metar.getColumnCount();
			result = new ColumnMeta[ncolumns];
			for (int i = 1; i <= ncolumns; i++) {

				int typeC = metar.getColumnType(i);
				Type type = Query.convertType(typeC);

				String nameC = metar.getColumnName(i);
				result[i - 1] = new ColumnMeta(type, nameC);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Error obtaining the query meta data");
			result = null;
		}

		return result;
	}

	private static Type convertType(int typeC) {
		Type type = null;
		switch (typeC) {
		case java.sql.Types.ARRAY:
			type = new TypeID("array");
			break;
		case java.sql.Types.BIGINT:
			type = new Rint();
			break;

		case java.sql.Types.BINARY:
			type = new Rint();
			break;
		case java.sql.Types.BIT:
			type = new Rint();
			break;
		case java.sql.Types.BLOB:
			type = new TypeID("blob");
			break;
		case java.sql.Types.BOOLEAN:
			type = new Rbool();
			break;
		case java.sql.Types.CHAR:
			type = new TypeID("char");
			break;
		case java.sql.Types.CLOB:
			type = new TypeID("clob");
		case java.sql.Types.DATALINK:
			type = new TypeID("datalink");
			break;
		case java.sql.Types.DATE:
			type = new TypeID("date");
			break;
		case java.sql.Types.DECIMAL:
			type = new Rfloat();
			break;
		case java.sql.Types.DISTINCT:
			type = new TypeID("distinct");
			break;
		case java.sql.Types.DOUBLE:
			type = new Rfloat();
			break;
		case java.sql.Types.FLOAT:
			type = new Rfloat();
			break;
		case java.sql.Types.INTEGER:
			type = new Rint();
			break;
		case java.sql.Types.JAVA_OBJECT:
			type = new TypeID("Java_Object");
			break;
		case java.sql.Types.LONGNVARCHAR:
			type = new TypeID("longnvarchar");
			break;
		case java.sql.Types.LONGVARBINARY:
			type = new TypeID("longvarbinary");
			break;
		case java.sql.Types.LONGVARCHAR:
			type = new TypeID("longvarchar");
			break;
		case java.sql.Types.NCHAR:
			type = new TypeID("nchar");
			break;
		case java.sql.Types.NCLOB:
			type = new TypeID("nclob");
			break;
		case java.sql.Types.NULL:
			type = new TypeID("null");
			break;
		case java.sql.Types.NUMERIC:
			type = new Rint();
			break;
		case java.sql.Types.NVARCHAR:
			type = new TypeID("nvarchar");
			break;
		case java.sql.Types.OTHER:
			type = new TypeID("other");
			break;
		case java.sql.Types.REAL:
			type = new Rfloat();
			break;
		case java.sql.Types.REF:
			type = new TypeID("ref");
			break;
		case java.sql.Types.REF_CURSOR:
			type = new TypeID("ref_cursor");
			break;
		case java.sql.Types.ROWID:
			type = new Rint();
			break;
		case java.sql.Types.SMALLINT:
			type = new Rint();
			break;
		case java.sql.Types.SQLXML:
			type = new TypeID("sqlxml");
			break;
		case java.sql.Types.STRUCT:
			type = new TypeID("struct");
			break;
		case java.sql.Types.TIME:
			type = new TypeID("time");
			break;
		case java.sql.Types.TIME_WITH_TIMEZONE:
			type = new TypeID("time_with_timezone");
			break;
		case java.sql.Types.TIMESTAMP:
			type = new TypeID("timestamp");
			break;
		case java.sql.Types.TINYINT:
			type = new Rint();
			break;
		case java.sql.Types.VARBINARY:
			type = new TypeID("varbinary");
			break;
		case java.sql.Types.VARCHAR:
			type = new TypeID("varchar");
			break;
		default:
			logger.error("Unexpected column type, id: {}", typeC);
			break;
		}

		return type;

	}

	/**
	 * Produces a list of types
	 * 
	 * @param sqlName
	 * @return
	 * @throws SQLException
	 */
	public static ColumnMeta[] getColumns(Connection conn, String sqlName) throws SQLException {
		Statement stAllr = conn.createStatement();
		ResultSet rsAllr = stAllr.executeQuery("select * from " + sqlName);
		ResultSetMetaData metar = rsAllr.getMetaData();
		ColumnMeta[] r = Query.getColumnMetas(metar);
		return r;
	}

	public static RelationMinAndMax getMinAndMaxFloat(Connection conn,String table, String colName) throws SQLException {
		RelationMinAndMax result=new RelationMinAndMax();
		conn.setAutoCommit(false);
		Statement st;

		st = conn.createStatement();
		// Turn use of the cursor on.
		st.setFetchSize(50);
		ResultSet rs = st.executeQuery("select min("+colName+"), max("+colName+") from "+table);
		if (rs.next()) {
		 result.min = new Operand(new FloatC(rs.getDouble(1)));
		 result.max = new Operand(new FloatC(rs.getDouble(2)));
		}
		return result;
		
	}

	public static RelationMinAndMax getMinAndMaxInteger(Connection conn,String table, String colName) throws SQLException {
		RelationMinAndMax result=new RelationMinAndMax();
		conn.setAutoCommit(false);
		Statement st;

		st = conn.createStatement();
		// Turn use of the cursor on.
		st.setFetchSize(50);
		ResultSet rs = st.executeQuery("select min("+colName+"), max("+colName+") from "+table);
		if (rs.next()) {
		 result.min = new Operand(new IntC(rs.getInt(1)));
		 result.max = new Operand(new IntC(rs.getInt(2)));
		}
		
		return result;
	}

}
