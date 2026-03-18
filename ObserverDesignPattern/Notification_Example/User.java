package ObserverDesignPattern.Notification_Example;

public class User implements Subscriber {

	private final int userID;

	public User(int userID) {
		this.userID = userID;
	}

	public void notify(String message) {
		System.out.printf("The user%d have been notified.", this.userID);
		System.out.print("\t" + message + "\n");
	}
}
