package ObserverDesignPattern.EventSubscription_Example;

import java.io.File;

public class LoggerEventListener implements EventListener {
	private final File logFile;

	public LoggerEventListener(String fileLocation) {
		this.logFile = new File(fileLocation);
	}

	@Override
	public void actionOnEvent(EventTypes event, File file) {
		System.out.printf("\nEvent: %s was received by %s\n", event.name(), this);
		System.out.println("Save to logfile: " + this.logFile.getName() + ": Someone has performed " + event.name() + " operation with the following file: " + file.getName());
	}

	@Override
	public String toString() {
		return "Object LoggerEventListener<" + this.logFile.getName() + ">";
	}
}
