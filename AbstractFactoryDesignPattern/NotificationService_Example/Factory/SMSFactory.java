package AbstractFactoryDesignPattern.NotificationService_Example.Factory;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;
import AbstractFactoryDesignPattern.NotificationService_Example.Message.SMSMessage;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.SMSSendingService;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.Sender;

public class SMSFactory implements Factory {
	@Override
	public Message createMessage() {
		return new SMSMessage();
	}

	@Override
	public Sender createSenderService() {
		return new SMSSendingService();
	}
}
