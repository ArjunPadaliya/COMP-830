package homework4;

public class SubscriberThrees implements ObserverInterface {

	public boolean notifyObserver() {
		if (Event.getEventData()%3 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

}
