package model.connection;

import java.util.Properties;

public class ConnectionData {
	private Properties props;
	private String url;
	private String dbName;

	public ConnectionData(Properties props, String url, String dbName) {
		super();
		this.props = props;
		this.url = url;
		this.dbName = dbName;
	}

	public Properties getProps() {
		return props;
	}

	public String getUrl() {
		return url;
	}

	public String getDbName() {
		return dbName;
	}

	@Override
	public String toString() {
		String r = "User: " + props.get("user") + ", URL " + url + ", Database: " + dbName + " file: "
				+ props.get("file");
		return r;
	}

}
