public interface PublisherInterface {
	
	void registerObserver(ObserverInterface o);
	
	void removeObserver(ObserverInterface o);
	
	void notifyObservers(Event event);
	
}
