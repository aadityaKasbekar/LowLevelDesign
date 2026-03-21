package AbstractFactoryDesignPattern.NotificationService_Example.Message;

public class SMSMessage implements Message {
	String toPhoneNum;
	String body;

	@Override
	public void setContent(String to, String body) {
		this.toPhoneNum = to;
		this.body = body.length() > 160 ? body.substring(0, 160) : body;
	}

	@Override
	public String formatMessage() {
		return "SMS to " + toPhoneNum + ": " + body;
	}
}
