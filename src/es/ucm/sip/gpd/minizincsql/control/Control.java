package es.ucm.sip.gpd.minizincsql.control;

import es.ucm.sip.gpd.minizincsql.gui.ViewInterface;
import es.ucm.sip.gpd.minizincsql.model.Model;

public class Control {
	
	private ViewInterface view;
	private Model mod;

	public Control(ViewInterface view, Model mod) {
		this.view = view;
		this.mod = mod;
	}

}
