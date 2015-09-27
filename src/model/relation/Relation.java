package model.relation;

import java.sql.Connection;

//import org.slf4j.Logger;

//import logback.AreaAppender;

public abstract class Relation {

	// private static final Logger logger =
	// AreaAppender.getLogger(Relation.class);

	/**
	 * Schema name
	 */
	private String schema;

	/**
	 * relation name
	 */
	private String name;

	private Connection conn;

	/**
	 * Creates a new relation with name {@code name}
	 * 
	 * @param name
	 *            The relation name
	 */
	public Relation(String name, String schema, Connection conn) {
		this.name = name;
		this.schema = schema;
		this.conn = conn;
	}

	/**
	 * Copy constructor
	 */
	public Relation(Relation r) {
		this.name = r.name;
		this.schema = r.schema;
		this.conn = r.conn;

	}

	/**
	 * @return true if this relation is a view
	 */
	public abstract boolean isView();

	public String getName() {
		return name;
	}

	public String getSchema() {
		return schema;
	}

	@Override
	public String toString() {

		return fullName();
	}

	public String fullName() {
		return getSchema() + "." + getName();
	}

}
