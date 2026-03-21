package AbstractFactoryDesignPattern.NotificationService_Example.Message;

public interface Message {
	void setContent(String to, String body);
	String formatMessage();
}
