package ObserverDesignPattern.EventSubscription_Example;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManger {
	Map<EventTypes, List<EventListener>> eventsBook = new HashMap<>();

	public EventManger(EventTypes... events) {
		for (EventTypes event : events) {
			this.eventsBook.put(event, new ArrayList<>());
		}
	}

	public void subscribeEvents(EventListener listener, EventTypes... events) {
		for (EventTypes event : events){
			if (!this.eventsBook.containsKey(event)) {
				eventsBook.put(event, new ArrayList<>());
			}
			eventsBook.get(event).add(listener);
		}
	}

	public void unSubscribeEvents(EventTypes event, EventListener listener) {
		if (!this.eventsBook.containsKey(event)) {
			throw new IllegalArgumentException(
					"Event(key) does not exist in EventsBook(map). Provided Event: " + event.name());
		}
		if (!this.eventsBook.get(event).remove(listener)) {
			throw new IllegalArgumentException(
					"Event listener(value) does not exist in EventsBook. Provided Listener: " + listener.toString());
		}
	}

	public void publishEvent(EventTypes event, File file) {
		if (!this.eventsBook.containsKey(event)) {
			throw new IllegalArgumentException(
					"The event(key) does not exist in the EventsBook(map) and hence not Publishing for this event. Provided Event: " + event.name());
		}
		for (EventListener listener : this.eventsBook.get(event)) {
			listener.actionOnEvent(event, file);
		}
	}
}
