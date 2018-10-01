package homework4;

public class SubscriberEvens implements ObserverInterface {

	public boolean notifyObserver() {
		if (Event.getEventData()%2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	

}
