package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageMenu extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Menu menu;

	public ImageMenu(Menu menu) {
		this.setPreferredSize(new Dimension(32, 32));
		this.menu = menu;

	}

	// Se crea un método cuyo parámetro debe ser un objeto Graphics

	public void paint(Graphics grafico) {
		Dimension height = getSize();

		// Se selecciona la imagen que tenemos en el paquete de la //ruta del
		// programa

		ImageIcon Img = new ImageIcon(getClass().getResource("/resources/applications-system.png"));

		// se dibuja la imagen que tenemos en el paquete Images //dentro de un
		// panel

		grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

		setOpaque(false);
		super.paintComponent(grafico);
	}

	public void showMenu() {
		ImageMenu mm = this;
		menu.show(mm, mm.getWidth() / 2, mm.getHeight() / 2);

	}
}
