package AbstractFactoryDesignPattern.NotificationService_Example.Sender;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;

public class SMSSendingService implements Sender {
	@Override
	public void sendMessage(Message message) {
		System.out.println("Sending Message via carrir api(): " + message.formatMessage());
	}
}
