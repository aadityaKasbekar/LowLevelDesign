package AbstractFactoryDesignPattern.NotificationService_Example.Sender;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;

public class EmailSendingService implements Sender {
	@Override
	public void sendMessage(Message message) {
		System.out.println("Sending message via SMTP: " + message.formatMessage());
	}
}
