import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface {

	private List<ObserverInterface> observers = new ArrayList();
	private Random random = new Random();

	@Override
	public void registerObserver(ObserverInterface o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(ObserverInterface o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers(Event event) {
		int oddsCount = 0;
		int threesCount = 0;

		List<ObserverInterface> curentObservers = observers;

		for (ObserverInterface o : curentObservers) {
			boolean response = o.notifyObserver(event);
			if (o instanceof SubscriberOdds && response && oddsCount++ > 20) {
				oddsCount = 0;
				removeObserver(o);
			}
			if (o instanceof SubscriberThrees && response && threesCount++ > 6) {
				threesCount = 0;
				removeObserver(o);
			}
		}
		if (event.getEventNumber() % 40 == 0) {
			if (!hasSubscriberOdds()) {
				registerObserver(new SubscriberOdds());
			}
			if (!hasSubscriberOdds()) {
				registerObserver(new SubscriberThrees());
			}
		}
	}

	private Event generateEvent(int number) {
		int rand = random.nextInt(5000) + 1;
		return new Event(number, rand);
	}

	public void runSimulation() {
		for (int i = 0; i < 200; i++) {
			Event event = generateEvent(i);
			notifyObservers(event);
		}
	}

	private boolean hasSubscriberOdds() {
		for (ObserverInterface o : observers) {
			if (o instanceof SubscriberOdds) {
				return true;
			}
		}
		return false;
	}

	private boolean hasSubscriberThees() {
		for (ObserverInterface o : observers) {
			if (o instanceof SubscriberThrees) {
				return true;
			}
		}
		return false;
	}
}