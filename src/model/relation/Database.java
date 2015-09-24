package model.relation;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;

import logger.AreaAppender;
import model.connection.ConnectionData;

/**
 * A database is basically a set of schemas, each one identified by its name
 * 
 * @author rafa
 *
 */
public class Database extends HashMap<String, Schema> {

	private static final Logger logger = AreaAppender.getLogger(Database.class);

	private List<String> searchPath;
	private ConnectionData cData;
	private static final long serialVersionUID = 1L;

	/*
	 * // this is used to control the Swingçworker processes deploying the //
	 * relations HashMap<String, DeployInBackGround> processes = new
	 * HashMap<String, DeployInBackGround>();
	 */
	/**
	 * @param searchPath
	 *            The search path value of the database
	 * @param cData
	 */
	public Database(List<String> searchPath, ConnectionData cData) {
		super();
		this.searchPath = searchPath;
		this.cData = cData;
	}

	/**
	 * A new relation for schema
	 * 
	 * @param schema
	 *            The schema name
	 * @param r
	 *            The relation
	 */
	public void put(String schema, Relation r) {
		Schema s = this.get(schema);
		// the schema not exists
		if (s == null) {
			Schema sr = new Schema(schema);
			sr.put(r);
			this.put(schema, sr);
		} else {
			s.put(r);
		}

	}

	/**
	 * Return a relation from its name. If the name is not qualified the
	 * relation is looked in the schemata following the search_path
	 * 
	 * @param name
	 *            relation name
	 * @return A relation in this database, or null if it is not found
	 */
	public Relation getRelation(String name) {
		Relation result = null;
		int posDot = name.indexOf('.');
		// if fully qualified
		if (posDot != -1) {
			String schemaName = name.substring(0, posDot);
			String relationName = name.substring(posDot + 1);
			// logger.trace("Fully qualified name: {}, schema name {}, relation
			// name {}", name, schemaName, relationName);
			result = getFullyQualifiedRelation(schemaName, relationName);
		} else {// not fully qualified
			result = getNotFullyQualified(name);
		}

		return result;
	}

	/**
	 * Return a database relation according to its name and the searchpath
	 * 
	 * @param name
	 * @return
	 */
	private Relation getNotFullyQualified(String name) {
		Relation result = null;
		// precond
		if (searchPath == null || searchPath.size() == 0)
			logger.error("Empty search path looking for relation {}", name);
		else {
			boolean found = false;
			for (int i = 0; i < searchPath.size() && !found; i++) {
				String s = searchPath.get(i);
				if (s.equals("\"$user\"")) {
					Properties props = cData.getProps();
					s = props.getProperty("user");
				}
				result = getFullyQualifiedRelation(s, name);
				found = result != null;
				if (found)
					logger.trace("Non-qualified relation {} found in schema {}", name, s);

			}

		}

		return result;
	}

	/**
	 * Obtains a database relation given the name of its schema and the name of
	 * the relation
	 * 
	 * @param schemaName
	 *            Name of the schema
	 * @param relationName
	 *            Name of the relation in the schema
	 * @return The relation, or null if it is not found
	 */
	public Relation getFullyQualifiedRelation(String schemaName, String relationName) {
		Relation result = null;
		Schema sch = this.get(schemaName);
		if (sch == null)
			logger.debug("Schema: {} not found", schemaName);
		else {
			result = sch.get(relationName);
			if (result == null)
				logger.debug("Relation {} not found in schema {}", relationName, schemaName);
		}

		return result;
	}

	/**
	 * Returns the process deploying the relation with the given fullname
	 * 
	 * @param fullName
	 *            Complete qualified name (schema.relation) of the relation
	 * @return Process deploying the relation if exists, null otherwise
	 */
	/*
	 * public DeployInBackGround getDeployingProcess(String fullName) {
	 * 
	 * return processes.get(fullName); }
	 */
	/**
	 * Adds a new deployment process
	 * 
	 * @param fullName
	 *            Associated fully qualified relation name, used as key
	 * @param deployProcess
	 *            The process
	 */
	/*
	 * public void putDeployingProcess(String fullName, DeployInBackGround
	 * deployProcess) { processes.put(fullName, deployProcess);
	 * 
	 * }
	 */

}
