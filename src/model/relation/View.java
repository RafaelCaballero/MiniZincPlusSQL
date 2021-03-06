package model.relation;

import java.sql.Connection;

import org.slf4j.Logger;

import logger.AreaAppender;

public class View extends Relation {

	private static final Logger logger = AreaAppender.getLogger(View.class);

	private String def;

	/**
	 * Constructs a view given its name. The definition is empty.
	 * 
	 * @param name
	 */
	private View(String name, String schema, Connection conn) {
		super(name, schema, conn);
		this.def = "";

	}

	/**
	 * Constructs a view given its name and definition
	 * 
	 * @param name
	 *            View name
	 * @param def
	 *            Code defining the view
	 */
	public View(String name, String schema, String def, Connection conn) {
		super(name, schema, conn);
		this.def = def;
	}

	/**
	 * Copy constructor
	 * 
	 * @param rprime
	 */
	public View(Relation r) {
		super(r);
	}

	@Override
	public boolean isView() {
		return true;
	}

	public String getDef() {
		return def;
	}

}
