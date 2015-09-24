package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;

import org.slf4j.Logger;

import gui.MainFrame;
import gui.ViewInterface;
import gui.statusbar.StatusBarMessage;
import logger.AreaAppender;
import model.Model;
import model.connection.ConnectionData;
import conf.AppConf;

public class Control implements ActionListener, MouseListener {

	private static final Logger logger = AreaAppender.getLogger(Control.class);

	private ViewInterface view;
	private Model mod;

	public Control(ViewInterface view, Model mod) {
		this.view = view;
		this.mod = mod;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		switch (s) {
		case ViewInterface.CONNECT:
			// connect to a database with a username and passwd.
			view.status("");
			view.openLoginForm();
			break;
		case ViewInterface.LOGINSTART:
			loginControl(true);
			break;
		case ViewInterface.LOGINEXIT:
			view.closeLoginForm();
			if (!mod.isConnected())
				view.status(new StatusBarMessage("", "Click on the upper-right icon to start"));
			break;

		case ViewInterface.DISCONNECT:
			boolean isDisconnected = mod.disconnect();
			if (isDisconnected) {
				view.status("Not Connected");
				mod.disconnect();
				view.openLoginForm();

			}
			break;
		}

	}

	private void loginControl(boolean save) {
		// close the login form
		view.closeLoginForm();
		if (save) {
			// save the login data to the configuration
			AppConf conf = view.getLoginConf();
			// save the configuration
			try {
				mod.saveLogin(conf);
				logger.info("Saved configuration in file {} ", conf.getPath());
			} catch (IOException e1) {
				logger.error("Error saving configuration " + e1.getMessage());
				e1.printStackTrace();
			}
		}
		// ask for the connection data
		ConnectionData cData = view.getConectionData();
		if (cData != null) {
			try {
				boolean success = mod.connect(cData);
				if (!success) {
					view.displayError("Connection error: database empty or not found! ", null);
					logger.error("Database empty or not found!");

				} else
					view.setConnected(cData, mod.getDB());
					// parse the model
					String fileName = cData.getProps().getProperty("file");
					try {
						MiniZincPlusModel mp = mod.process(fileName);
					} catch (Exception e) {
						view.displayError("Error processing file  ",e);
						logger.error("Error processing file {}",fileName);
					}
			} catch (ClassNotFoundException e) {
				view.displayError("Driver not found ", e);
				logger.error("Driver not found!");
			} catch (SQLException ex) {
				view.displayError("Connection failed ", ex);
				logger.error("Connection failed. \n {} ", cData);
			}
		}

	}

}
