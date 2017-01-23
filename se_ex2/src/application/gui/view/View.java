
package application.gui.view;

import java.util.ArrayList;
import application.logic.Observer;

public class View{
	private ArrayList<Observer> listOfObservers;
	private Ctrl ctrl;
	
	/*#application.logic.Observer lnkObserver*/
	/*#application.logic.model.Model lnkModel*/

	public View() {
		//initialize game board here. it should be updated over the display method further down 
	}

	public void setCtrl(Ctrl ctrl) {
		this.ctrl = ctrl;
	}

	public void display(ArrayList<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	public void askPlayername() {
		// TODO Auto-generated method stub
		
	}

	

}
