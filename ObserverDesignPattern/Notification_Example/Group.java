package ObserverDesignPattern.Notification_Example;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Subscriber> subscriberList;

	public Group() {
		this.subscriberList = new ArrayList<>();
	}

	public void subcribeUser(Subscriber user) {
		this.subscriberList.add(user);
		System.out.println("User has been added to the Subscriber's List");
	}

	public void unsubcribeUser(Subscriber user) {
		this.subscriberList.remove(user);
		System.out.println("User has been removed from the Subscriber's List");
	}

	public void notify(String message) {
		for (Subscriber user: subscriberList) {
			user.notify(message);
		}
	}
}
