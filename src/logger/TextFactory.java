package logger;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class TextFactory {

	private static JTextPane text;

	public static void setText(JTextPane text) {
		TextFactory.text = text;
	}

	public static JTextPane getText() {
		return text;
	}

	public static void add(String s) {
		StyledDocument doc = text.getStyledDocument();

		// Define a keyword attribute for future use

		SimpleAttributeSet keyWord = new SimpleAttributeSet();
		StyleConstants.setForeground(keyWord, Color.RED);
		StyleConstants.setBackground(keyWord, Color.YELLOW);
		StyleConstants.setBold(keyWord, true);

		// Add some text

		try {
			if (s.toUpperCase().contains("ERROR"))
				doc.insertString(doc.getLength(), s, keyWord);
			else
				doc.insertString(doc.getLength(), s, null);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
