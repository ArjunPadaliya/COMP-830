public class SubscriberEvens implements ObserverInterface {

	public boolean notifyObserver(Event event) {
		if (event.getEventNumber() % 2 == 0) {
			System.out.printf("Event %d is even: %d%n", event.getEventNumber(), event.getEventData());
			return true;
		}
		return false;
	}
}
