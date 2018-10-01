package homework4;

public class SubscriberOdds implements ObserverInterface {
	
	public boolean notifyObserver() {
		if (Event.getEventData()%2 != 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

}