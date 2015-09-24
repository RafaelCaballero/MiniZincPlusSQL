package conf;

import java.io.*;
import java.net.URLDecoder;
import java.util.Properties;

import org.slf4j.Logger;

import logger.AreaAppender;

/**
 * Manages the configuration of the app.
 *
 * @author rafa
 *
 */
public class AppConf extends Properties {

	private static final Logger logger = AreaAppender.getLogger(AppConf.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Path to the configuration file
	 */
	private String path;

	/**
	 * Path of the current jar file folder (that the is path to the folder
	 * excluding the filename)
	 */
	private String pathFolder;

	/**
	 * Creates an empty property list with no default values
	 * 
	 * @param path
	 *            Path to the configuration file
	 */
	public AppConf() {
		super();

		// get the path of the jar file
		// CodeSource codeSource =
		// AppConf.class.getProtectionDomain().getCodeSource();
		this.path = null;
		// File jarFile;
		try {
			setPath();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// try to load the file
		try {
			load();
		} catch (Exception e) {
			logger.info("Configuration file " + path + " no found");
		}
		// loadDefaults();
	}

	private void setPath() {
		String path = AppConf.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		String decodedPath;
		try {
			decodedPath = URLDecoder.decode(path, "UTF-8");
			// remove the last '/'
			int l = decodedPath.length();
			decodedPath = decodedPath.substring(0, l - 1);
			int pos = decodedPath.lastIndexOf(File.separator);
			pathFolder = pos != -1 ? decodedPath.substring(0, pos) : ".";
			// System.out.println("path: " + pathFolder);
			this.path = pathFolder + File.separator + "minizincsql.conf";
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void load() throws IOException {
		loadDefaults();
		FileInputStream in = new FileInputStream(path);
		load(in);
		in.close();
	}

	/**
	 * Some default properties.
	 */
	public void loadDefaults() {
		/**
		 * User name
		 */
		setProperty("user", "");
		/*
		 * connect to this database
		 */
		setProperty("database", "");
		/**
		 * url for the connection
		 */
		setProperty("url", "jdbc:postgresql://localhost:5432/");
		/**
		 * Use ssl connection?
		 */
		setProperty("ssl", "false");
		/**
		 * Save data?
		 */
		setProperty("save", "false");
		/**
		 * Level of information displaying during the process.
		 */
		setProperty("infolevel", "INFO");
		/**
		 * Logging configuration file
		 */
		setProperty("logconf", pathFolder + File.separator + "logconf.xml");

		// MiniZinc+SQL fileName
		setProperty("file", "");

		/**
		 * Url with the help file
		 */
		setProperty("helpURL", "http://gpd.sip.ucm.es/rafa/hopla/sbuggy.html");

	}

	public void store() throws IOException {
		if (path == null)
			setPath();
		FileOutputStream out = new FileOutputStream(path);
		store(out, "---SBuggy Configuration File---");
		out.close();
	}

	/**
	 * @return Folder where the configuration is saved
	 */
	public String getPath() {

		return path;
	}

}
