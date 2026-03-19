package ObserverDesignPattern.EventSubscription_Example;

import java.io.File;

public interface EventListener {
	void actionOnEvent(EventTypes event, File file);
}
