package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageSQLMiniZinc extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ImageSQLMiniZinc() {
		this.setPreferredSize(new Dimension(200, 72));

	}

	// Se crea un método cuyo parámetro debe ser un objeto Graphics

	public void paint(Graphics grafico) {
		Dimension height = getSize();

		// Se selecciona la imagen que tenemos en el paquete de la //ruta del
		// programa

		ImageIcon Img = new ImageIcon(getClass().getResource("/resources/sqlmini.png"));

		// se dibuja la imagen que tenemos en el paquete Images //dentro de un
		// panel

		grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

		setOpaque(false);
		super.paintComponent(grafico);
	}

}
