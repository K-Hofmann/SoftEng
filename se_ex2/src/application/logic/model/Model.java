
package application.logic.model;

import java.util.ArrayList;

import application.logic.Observer;
import application.logic.Subject;

public class Model implements Subject{
	
	private Observer obs;
	private ArrayList<Observer> listOfObservers;
	
/*#application.logic.Subject lnkSubject*/
	public Model() {
		//
	}

	public void setObserver(Observer observer){
		obs = observer;
	}

	public ArrayList<Observer> getPlayers() {
		return listOfObservers;
	}
	
	public void startGame(){
		
	}

	@Override
	public void detach(Observer observer) {
		listOfObservers.add(observer);		
	}

	@Override
	public void attatch(Observer observer) {
		listOfObservers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for(Observer observer: listOfObservers){
			observer.update();
		}
		
	}

}
