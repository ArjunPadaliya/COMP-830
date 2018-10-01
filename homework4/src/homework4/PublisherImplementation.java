package homework4;

import java.util.ArrayList;

public class PublisherImplementation implements PublisherInterface{
	
	private ArrayList<ObserverInterface>subscribers = new ArrayList<ObserverInterface>();
	
	
	Event generateEvent()
	{
		Event e = new Event(2,3);
		return e;
	}
	
	public void runStimulation()
	{
		for(int i=1; i<200; i++)
		{
			int random = (int)(Math.random() * 5000 + 1);
			
		}
	}
	
	public void notifyObserver(Event e)
	{
		
	}
	
	public void notifyObservers(ObserverInterface o)
	{
		o.notifyObserver();	
	}

	public void registerObserver(ObserverInterface o) {
		subscribers.add(o);
	}

	public void removeObserver(ObserverInterface o) {
		subscribers.remove(o);
	}

}