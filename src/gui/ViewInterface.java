package gui;

import conf.AppConf;
import control.Control;
import gui.statusbar.StatusBarMessage;
import minizinc.representation.mznmodel.MiniZincSQLModel;
import model.connection.ConnectionData;
import model.relation.Database;

public interface ViewInterface {

	public static final String CONNECT = "connect";
	public static final String DISCONNECT = "disconnect";
	public static final String LOGINSTART = "loginstart";
	public static final String LOGINEXIT = "loginexit";

	/**
	 * The view uses the control mainly as listener
	 * 
	 * @param control
	 */
	public void setController(Control control);

	/**
	 * Start the show
	 */
	public void start();

	/**
	 * Displays a message in the status bar
	 * 
	 * @param msg
	 *            message to display
	 */
	void status(String msg);

	void status(StatusBarMessage msg);

	/**
	 * Opens the login form. Employed to connect to the database
	 */
	void openLoginForm();

	/**
	 * Closes the login form
	 */
	void closeLoginForm();

	ConnectionData getConectionData();

	void displayError(String msg, Exception e);

	/**
	 * Perform changes after a connection
	 * 
	 * @param props
	 *            Properties defining the connection
	 * @param db
	 *            database
	 */
	void setConnected(ConnectionData props, Database db);

	/**
	 * Gets the login information
	 * 
	 * @return The application configuration modified after the login process
	 */
	AppConf getLoginConf();

	/**
	 * Shows the result after the preprocessing
	 * @param mp
	 */
	public void displayPreprocess(MiniZincSQLModel mp);

}
