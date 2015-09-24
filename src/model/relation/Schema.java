package model.relation;

import java.util.HashMap;

public class Schema extends HashMap<String, Relation> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public Schema(String name) {
		super();
		this.name = name;

	}

	public void put(Relation r) {
		this.put(r.getName(), r);

	}

}
