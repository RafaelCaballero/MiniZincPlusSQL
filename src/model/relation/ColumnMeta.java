package model.relation;

/**
 * Data identifying a column in a database
 * 
 * @author rafa
 *
 */
public class ColumnMeta {
	private int columnType;
	private String columnName;

	public ColumnMeta(int columnType, String columnName) {
		this.columnType = columnType;
		this.columnName = columnName;
	}

	/**
	 * @return the columnType
	 */
	public int getColumnType() {
		return columnType;
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		result = prime * result + columnType;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColumnMeta other = (ColumnMeta) obj;
		if (columnName == null) {
			if (other.columnName != null)
				return false;
		} else if (!columnName.equals(other.columnName))
			return false;
		if (columnType != other.columnType)
			return false;
		return true;
	}

}
