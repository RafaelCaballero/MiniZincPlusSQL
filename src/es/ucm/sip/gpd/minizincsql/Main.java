package es.ucm.sip.gpd.minizincsql;

import java.awt.EventQueue;

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
		mod = new Model();
		// view
		view = new DebuggerFrame();
		// controller
		control = new Controller(view, mod);
		// configura la vista
		view.setController(control);
		// y arranca la interfaz (vista):
		view.start();
	}

}
