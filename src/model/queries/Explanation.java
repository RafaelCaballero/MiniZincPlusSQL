package model.queries;

/**
 * Result of the comparison between the result sets of two relations and its
 * explanation
 * 
 * @author rafa
 *
 */
public class Explanation {

	private String exp;
	private boolean identical;
	private boolean error;

	/**
	 * Constructor. Assumes that there is no error in the comparison
	 * 
	 * @param identical
	 * @param exp
	 */
	public Explanation(boolean identical, String exp) {
		this.identical = identical;
		this.exp = exp;
		this.error = false;
	}

	public Explanation(boolean identical, boolean error, String exp) {
		this.identical = identical;
		this.exp = exp;
		this.error = error;
	}

	/**
	 * Explanation of the result
	 * 
	 * @return the explanation
	 */
	public String getExplanation() {
		return exp;
	}

	/**
	 * Indicates if the two relations were identical (w.r.t. the chosen
	 * criterium)
	 * 
	 * @return true if the two relations are equal, false otherwise
	 */
	public boolean getAreEqual() {
		return identical;
	}

	/**
	 * Indicates if an error in the comparison has occurred
	 * 
	 * @return true if an error occurred, false otherwise
	 */
	public boolean getError() {
		return error;
	}

}
