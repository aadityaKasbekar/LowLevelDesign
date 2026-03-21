package AbstractFactoryDesignPattern.NotificationService_Example.Message;

public class EmailMessage implements Message {
	String toEmailID;
	String body;

	@Override
	public void setContent(String to, String body) {
		this.toEmailID = to;
		this.body = body;
	}

	@Override
	public String formatMessage() {
		return "Email to <" + this.toEmailID + ">: " + this.body;
	}
}
