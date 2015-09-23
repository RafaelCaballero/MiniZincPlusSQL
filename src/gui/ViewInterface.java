package gui;

import control.Control;

public interface ViewInterface {
	
	/**
	 * The view uses the control mainly as listener
	 * @param control
	 */
	public void setController(Control control);

	/**
	 * Start the show
	 */
	public void start();

}
