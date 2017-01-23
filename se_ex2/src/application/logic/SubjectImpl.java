package application.logic;

import java.util.ArrayList;

public class SubjectImpl implements Subject{


	private ArrayList<Observer> listOfObservers;
	
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
