package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledDocument;

import org.slf4j.Logger;

import conf.AppConf;
import control.Control;
import gui.statusbar.StatusBar;
import gui.statusbar.StatusBarMessage;
import logger.AreaAppender;
import logger.TextFactory;
import model.connection.ConnectionData;
import model.relation.Database;

public class MainFrame extends JFrame implements ViewInterface {

	private Control control;

	private static final Logger logger = AreaAppender.getLogger(MainFrame.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color SIDECOLOR = new Color(230, 230, 255);;
	private static String appname = "MiniZinc+SQL";
	private static String appdesc = "Constraints with SQL ";
	private static String title = "MiniZinc+SQL";
	private Menu menu = new Menu("Menu");
	private ImageMenu imageMenu = new ImageMenu(menu);
	private AppConf conf = new AppConf();
	// login form
	private LoginForm login = new LoginForm(null, true, conf);
	// database data
	private Database db = null;
	private String dbName;
	private String fileName;

	// private JDialog helpDialog;
	private AboutDialog aboutDialog;

	JTabbedPane center;

	JScrollPane spane = null;

	// status bar
	StatusBar statusBar = null;

	/**
	 * To display the source code of the view
	 */
	// Create the StyleContext, the document and the pane
	// private StyleContext sc = new StyleContext();
	final SyntaxDocument doc = new SyntaxDocument();
	private JTextPane textSourceCode;
	private static int SOURCECODETAB = 0;
	private JTextPane output;

	/**
	 * Constructs the main window
	 * 
	 * @throws HeadlessException
	 */
	public MainFrame() throws HeadlessException {
		super();
		init();
	}

	private void init() {
		setTitle(title);

		initComponents();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {

			e.printStackTrace();
		}

		/*
		 * setLocationRelativeTo(null); setSize(640, 480);
		 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); pack();
		 * setVisible(true);
		 */

	}

	/**
	 * Prepare the main window
	 */
	private void initComponents() {
		// borderLayout as outer level
		JPanel panel = new JPanel(new BorderLayout());
		// panel.setBorder((Border) new EmptyBorder(new Insets(0, 5, 5, 5)));

		// menu
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");

		menubar.add(file);

		JPanel top = topPanel();
		panel.add(top, BorderLayout.NORTH);
		JTabbedPane center = centerPanel();
		panel.add(center, BorderLayout.CENTER);

		add(panel);

		statusBar = new StatusBar();
		// statusbar.setBorder(LineBorder.createGrayLineBorder());
		add(statusBar, BorderLayout.SOUTH);
		pack();

	}

	private JTabbedPane centerPanel() {
		createCenterPanel();
		return center;
	}

	/**
	 * Tabbed panel at the east
	 * 
	 * @return
	 */
	private void createCenterPanel() {

		center = new JTabbedPane();
		// ImageIcon sqlmini = createImageIcon("/resources/sqlminimini.png",
		// "");
		// ImageIcon logicon = createImageIcon("/resources/log-icon.png", "");
		// ImageIcon viewicon = createImageIcon("/resources/viewIcon.png", "");

		textSourceCode = new JTextPane(this.doc);
		JScrollPane stextView = new JScrollPane(textSourceCode);
		center.addTab("Source", null, stextView, "MiniZinc+SQL source");
		SOURCECODETAB = 1;
		// center.setEnabledAt(0, false);

		this.output = new JTextPane();
		JScrollPane outputView = new JScrollPane(output);
		center.addTab("Output", null, outputView, "Program output");

		JTextPane text = new JTextPane();
		JScrollPane stext = new JScrollPane(text);
		center.addTab("Log", null, stext, "Logging information");
		TextFactory.setText(text);

	}

	private JPanel topPanel() {
		JPanel top = new JPanel(new BorderLayout());
		top.setBorder((Border) new EmptyBorder(new Insets(5, 5, 5, 5)));

		JPanel topLeft = new JPanel(new BorderLayout());
		topLeft.setBorder((Border) new EmptyBorder(new Insets(3, 3, 3, 3)));

		JPanel topLeftCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		Color cTop = /* Color.WHITE; */ new Color(30, 50, 100);
		top.setBackground(cTop);
		topLeft.setBackground(cTop);
		topLeftCenter.setBackground(cTop);
		topRight.setBackground(cTop);
		JLabel labelName = new JLabel(appname);
		JLabel labelDesc = new JLabel(" -  " + appdesc);

		labelName.setBackground(new Color(30, 50, 100));
		labelName.setForeground(new Color(00, 250, 100));
		labelDesc.setBackground(new Color(30, 50, 100));
		labelDesc.setForeground(new Color(255, 255, 255));

		Font fontappname = new Font("SansSerif", Font.ITALIC + Font.BOLD, 20);
		Font fontappdesc = new Font("Serif", Font.ITALIC + Font.BOLD, 16);
		labelName.setFont(fontappname);
		labelDesc.setFont(fontappdesc);
		topLeftCenter.add(labelName);
		topLeftCenter.add(labelDesc);

		// ImageHopla image = new ImageHopla();
		// topLeft.add(image,BorderLayout.WEST);
		topLeft.add(topLeftCenter, BorderLayout.CENTER);
		topRight.add(imageMenu);

		top.add(topLeft, BorderLayout.WEST);
		top.add(topRight, BorderLayout.EAST);

		return top;
	}

	@Override
	public void setController(Control control) {
		// display the menu associated to the icon
		imageMenu.addMouseListener(control);
		menu.setActionListener(control);
		login.setActionListener(control);

	}

	@Override
	public void start() {
		statusBar.setMessage("");
		setLocationRelativeTo(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		setVisible(true);
		login.setVisible(true);

	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	@Override
	public void status(String msg) {
		statusBar.setMessage(msg);

	}

	@Override
	public void status(StatusBarMessage msg) {
		this.statusBar.setMessage(msg);

	}

	@Override
	public void openLoginForm() {
		login.setVisible(true);

	}

	@Override
	public void closeLoginForm() {
		login.setVisible(false);

	}

	@Override
	public ConnectionData getConectionData() {
		Properties props = new Properties();
		props.setProperty("user", login.getUser());
		props.setProperty("password", login.getPass());
		props.setProperty("ssl", login.getSsl());
		props.setProperty("file", login.getFile());
		String url = login.getUrl();
		String database = login.getDatabase();
		ConnectionData cd = new ConnectionData(props, url, database);
		return cd;
	}

	@Override
	public void displayError(String msg, Exception e) {
		JOptionPane.showMessageDialog(null, "Error: " + msg + (e == null ? "" : e.getMessage()), "Error",
				JOptionPane.ERROR_MESSAGE);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see view.ViewInterface#setConnected(model.connection.ConnectionData,
	 * model.relation.Database)
	 */
	public void setConnected(ConnectionData props, Database db) {
		statusBar.setMessage(
				"Connected to database " + props.getDbName() + " by user " + props.getProps().getProperty("user"));
		menu.disableConnect();

		this.db = db;
		this.dbName = props.getDbName();
		this.fileName = props.getProps().getProperty("file");

		// display the source file
		Path p = Paths.get(fileName);
		try {
			List<String> lines = Files.readAllLines(p, StandardCharsets.UTF_8);

			textSourceCode.setText("% MiniZinc+SQL file\n");
			try {
				StyledDocument document = (StyledDocument) textSourceCode.getDocument();

				for (String line : lines)
					document.insertString(document.getLength(), line + "\n", null);

			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		center.updateUI();

	}

	@Override
	public AppConf getLoginConf() {
		AppConf result = login.getConfig();

		return result;

	}

}
