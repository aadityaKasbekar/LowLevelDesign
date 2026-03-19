package ObserverDesignPattern.Notification_Example;

public class Driver {
	public static void main(String[] args) {
		Group grp = new Group();
		User user1 = new User(1);
		User user2 = new User(2);
		User user3 = new User(3);

		grp.subcribeUser(user1);
		grp.subcribeUser(user2);
		grp.subcribeUser(user3);
		grp.notify("New Crazy Message.");

		grp.unsubcribeUser(user2);
		grp.notify("Very Crazy message.");
	}
}
