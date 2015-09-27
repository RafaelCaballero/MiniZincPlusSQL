package model.relation;

import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;

/**
 * Data identifying a column in a database
 * 
 * @author rafa
 *
 */
public class ColumnMeta {
	private Type columnType;
	private String columnName;
	private boolean mixed;

	public ColumnMeta(Type columnType, String columnName) {
		this.columnType = columnType;
		this.columnName = columnName;
		this.mixed = !(columnType instanceof TypeID);
	}

	/**
	 * @return the columnType
	 */
	public Type getColumnType() {
		return columnType;
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		result = prime * result + ((columnType == null) ? 0 : columnType.hashCode());
		result = prime * result + (mixed ? 1231 : 1237);
		return result;
	}

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
		if (columnType == null) {
			if (other.columnType != null)
				return false;
		} else if (!columnType.equals(other.columnType))
			return false;
		if (mixed != other.mixed)
			return false;
		return true;
	}

	public boolean getMixed() {
		return mixed;
	}

}
