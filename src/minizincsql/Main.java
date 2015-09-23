package minizincsql;

import java.awt.EventQueue;

import control.Control;
import gui.MainFrame;
import model.Model;

/**
 * Main class for the MiniZincPluSQL project.
 * @author rafa
 *
 */
public class Main {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				mvc();

			}
		});
	}

	public static void mvc() {
		// the model
		Model mod = new Model();
		// view
		MainFrame view = new MainFrame();
		// controller
		Control control = new Control(view, mod);
		// configura la vista
		view.setController(control);
		// y arranca la interfaz (vista):
		view.start();
	}

}
