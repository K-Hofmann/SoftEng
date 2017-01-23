package application.logic;

import application.gui.view.Ctrl;
import application.gui.view.View;
import application.logic.model.Model;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Ctrl ctrl = new Ctrl(model, view);
		view.setCtrl(ctrl);
		model.attatch(ctrl);
		model.startGame();
		

	}

}
