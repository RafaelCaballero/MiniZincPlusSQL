package gui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HelpFile {

	private String helpContent = null;
	private static String helpFile = "/resources/help/help.html";

	public HelpFile() {

		FileReader reader = null;
		try {
			File file = new File(getClass().getResource(helpFile).getFile());
			// Desktop.getDesktop().browse(file.toURI());

			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			helpContent = new String(chars);
			reader.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			Logger.getLogger(HelpFile.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "File " + helpFile + " does not exist \n");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public String toString() {
		return helpContent;
	}
	/*
	 * private String readFile( String file ) throws IOException {
	 * BufferedReader reader = new BufferedReader( new FileReader (file));
	 * String line = null; StringBuilder stringBuilder = new StringBuilder();
	 * String ls = System.getProperty("line.separator");
	 * 
	 * while( ( line = reader.readLine() ) != null ) { stringBuilder.append(
	 * line ); stringBuilder.append( ls ); }
	 * 
	 * reader.close(); return stringBuilder.toString(); }
	 */

}
