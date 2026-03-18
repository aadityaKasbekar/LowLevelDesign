package ObserverDesignPattern.EventSubscription_Example;

import java.io.File;

public class EmailEventListener implements EventListener {
	private final String emailID;

	public EmailEventListener(String emaiID) {
		this.emailID = emaiID;
	}

	@Override
	public void actionOnEvent(EventTypes event, File file) {
		System.out.printf("\nEvent: %s was received by %s\n", event.name(), this);
		System.out.println("Email to " + this.emailID + ": Someone has performed " + event.name() + " operation with the following file: " + file.getName());
	}

	@Override
	public String toString() {
		return "Object EmailEventListener<" + this.emailID + ">";
	}
}
