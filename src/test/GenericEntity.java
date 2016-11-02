package test;

/**
 * Created by abhishekbarla on 11/2/16.
 */
public abstract class GenericEntity {

	private String rowID;

	/**
	 * Getter for property 'rowID'.
	 *
	 * @return Value for property 'rowID'.
	 */
	public String getRowID() {
		return rowID;
	}

	/**
	 * Setter for property 'rowID'.
	 *
	 * @param rowID Value to set for property 'rowID'.
	 */
	public void setRowID(String rowID) {
		this.rowID = rowID;
	}

	public abstract boolean equals();

	public abstract int hashCode();
}
