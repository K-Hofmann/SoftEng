
package application.logic;

public interface Subject {

	/*#application.logic.Observer lnkObserver*/

	public void detach(Observer Observer );
	public void attatch(Observer Observer );
	public void notifyObserver();
}
