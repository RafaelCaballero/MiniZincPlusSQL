package gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Sep 25, 2012, 4:25:02 AM
 */

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import conf.AppConf;
import control.Control;

/**
 *
 * @author Virtuplus
 */
public class LoginForm extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static boolean connect = false;
	private static AppConf conf;

	public boolean getConnect() {
		return connect;
	}

	/** Creates new form Login */
	public LoginForm(Dialog d, boolean b, AppConf conf) {
		super(d, b);
		initComponents(conf);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 *
	 */
	private void initComponents(AppConf conf) {
		LoginForm.conf = conf;
		connect = false;
		JPanel mainPanel = new JPanel(new BorderLayout());
		this.setLayout(new BorderLayout());
		mainPanel.setBorder((Border) new EmptyBorder(new Insets(5, 5, 5, 5)));
		JPanel mainCenterPanel = new JPanel(new BorderLayout());
		mainCenterPanel.setBorder((Border) new EmptyBorder(new Insets(15, 15, 15, 15)));
		JPanel southPanel = new JPanel(new FlowLayout());
		southPanel.setBorder((Border) new EmptyBorder(new Insets(5, 3, 5, 3)));

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		user = new javax.swing.JTextField();
		String usrValue = conf.getProperty("user");
		user.setText(usrValue);
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabelFile = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		pass = new javax.swing.JPasswordField();
		url = new javax.swing.JTextField();
		url.setPreferredSize(new Dimension(150, 0));
		String urlValue = conf.getProperty("url");
		url.setText(urlValue);
		database = new javax.swing.JTextField();
		String dbValue = conf.getProperty("database");
		database.setText(dbValue);
		String fileValue = conf.getProperty("file");
		file = new javax.swing.JTextField();
		file.setText(fileValue);
		ssl = new javax.swing.JCheckBox();
		ssl.setSelected(conf.getProperty("ssl").equals("true"));
		save = new javax.swing.JCheckBox();
		save.setSelected(conf.getProperty("save").equals("true"));

		setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
		setTitle("PostgreSQL connection");
		setResizable(false);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loginicon.png")));

		jLabel2.setText("Username :  ");

		jLabel3.setText("Password :  ");

		jLabel4.setText("URL :");

		jLabel5.setText("Database :");

		jLabel6.setText("SSL :");
		jLabel7.setText("Save :");
		jLabelFile.setText("MiniZinc+SQL file:");

		GridLayout experimentLayout = new GridLayout(0, 1);
		experimentLayout.setHgap(-1);
		experimentLayout.setVgap(4);
		JPanel questions = new JPanel(experimentLayout);
		JPanel answers = new JPanel(experimentLayout);
		questions.add(jLabel2);
		answers.add(user);
		questions.add(jLabel3);
		answers.add(pass);
		questions.add(jLabel4);
		answers.add(url);
		questions.add(jLabel5);
		answers.add(database);

		questions.add(jLabelFile);
		answers.add(file);

		southPanel.add(jLabel6);
		southPanel.add(ssl);
		southPanel.add(jLabel7);
		southPanel.add(save);

		// questions.add(jLabel6);
		// answers.add(ssl);

		// SOUTH
		jButton1.setText("Exit");
		jButton1.setActionCommand(ViewInterface.LOGINEXIT);

		jButton2.setText("Start");
		jButton2.setActionCommand(ViewInterface.LOGINSTART);

		/*
		 * questions.add(jButton2); questions.add(jButton1);
		 */
		JPanel centerCenter = new JPanel(new BorderLayout());
		// JPanel centerCenterCenter = new JPanel(new BorderLayout());
		centerCenter.add(questions, BorderLayout.WEST);
		centerCenter.add(answers, BorderLayout.CENTER);
		centerCenter.add(southPanel, BorderLayout.SOUTH);
		;
		mainCenterPanel.add(centerCenter, BorderLayout.CENTER);

		JPanel buttonPane = new JPanel();
		buttonPane.add(jButton2);
		buttonPane.add(jButton1);
		mainCenterPanel.add(buttonPane, BorderLayout.SOUTH);

		mainPanel.add(jLabel1, BorderLayout.WEST);
		mainPanel.add(mainCenterPanel, BorderLayout.CENTER);
		this.add(mainPanel, BorderLayout.CENTER);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 500) / 2, (screenSize.height - 250) / 2, 500, 250);
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabelFile;
	private javax.swing.JPasswordField pass;
	private javax.swing.JTextField user;
	private javax.swing.JTextField url;
	private javax.swing.JTextField database;
	private javax.swing.JTextField file;
	private javax.swing.JCheckBox ssl;
	private javax.swing.JCheckBox save;

	public void setActionListener(Control control) {
		jButton1.addActionListener(control);
		jButton2.addActionListener(control);

	}

	public String getUser() {
		return user.getText();
	}

	public String getPass() {
		return new String(pass.getPassword());
	}

	public String getUrl() {
		return url.getText();
	}

	public String getSave() {
		return save.isSelected() ? "true" : "false";
	}

	public String getDatabase() {
		return database.getText();
	}

	public String getSsl() {
		return ssl.isSelected() ? "true" : "false";
	}

	public String getFile() {
		return file.getText();
	}

	public AppConf getConfig() {
		conf.setProperty("ssl", getSsl());
		conf.setProperty("url", getUrl());
		conf.setProperty("save", getSave());
		conf.setProperty("user", getUser());
		conf.setProperty("database", getDatabase());
		conf.setProperty("file", getFile());
		return conf;
	}

}
