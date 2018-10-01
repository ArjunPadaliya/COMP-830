package homework4;

public interface PublisherInterface {
	
	public void registerObserver(ObserverInterface o);
	
	public void removeObserver(ObserverInterface o);
	
	public void notifyObservers(ObserverInterface o);

}
