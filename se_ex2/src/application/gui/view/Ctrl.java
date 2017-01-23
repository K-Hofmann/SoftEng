
package application.gui.view;

import java.util.ArrayList;

import application.logic.Observer;
import application.logic.model.Model;

public class Ctrl implements Observer{
	
	private ArrayList<Object> players;
	private Model model;
	private View view;
	/*#application.gui.view.View lnkView*/

	/*#application.logic.Observer lnkObserver*/
	/*#application.logic.model.Model lnkModel*/

	public Ctrl(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public ArrayList<Object> getPlayers() {
		return players;
	}
	
	public void Listeners() {
		return;
	}

	@Override
	public void update() {
		if (players.size() < 4){
			view.askPlayername();
		}else if(false){
			
		}else{
			view.display(model.getPlayers());			
		}
			}

}
