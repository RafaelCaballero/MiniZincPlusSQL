package model.relation;

import java.sql.Connection;

public class Table extends Relation {

	public Table(String name, String schema, Connection conn) {
		super(name, schema, conn);
	}

	/**
	 * Copy constructor
	 * 
	 * @param r
	 */
	public Table(Relation r) {
		super(r);
	}

	@Override
	public boolean isView() {
		return false;
	}

}
