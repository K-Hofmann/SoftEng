package application.logic;

import java.util.ArrayList;

public class ObserverImpl implements Observer{
	
	private ArrayList<Object> players;
	
	
	@Override
	public void update() {
		
		System.out.println("do things");
		
	}


	public ArrayList<Object> getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList<Object> players) {
		this.players = players;
	}
	
	
	
}
