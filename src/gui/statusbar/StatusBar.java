package gui.statusbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel west;
	private JLabel east;

	/** Creates a new instance of StatusBar */
	public StatusBar() {
		super(new BorderLayout());
		super.setPreferredSize(new Dimension(-1, 22));
		setBackground(new Color(200, 200, 200));
		west = new JLabel();
		east = new JLabel();
		// east.setForeground(Color.GREEN);
		this.add(west, BorderLayout.WEST);
		this.add(east, BorderLayout.EAST);
	}

	public void setWestMessage(String message) {
		west.setText(" " + message);
		repaint();
	}

	public void setEastMessage(String message) {
		east.setText(message + " ");
		repaint();

	}

	public void setMessage(StatusBarMessage msg) {
		if (msg != null) {
			setWestMessage(msg.getMsg1());
			setEastMessage(msg.getMsg2());
		} else {
			setWestMessage("");
			setEastMessage("");

		}
		repaint();

	}

	public void setMessage(String string) {
		setWestMessage(string);
		setEastMessage("");
		repaint();

	}
}

