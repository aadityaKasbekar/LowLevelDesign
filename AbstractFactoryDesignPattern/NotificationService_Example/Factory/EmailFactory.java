package AbstractFactoryDesignPattern.NotificationService_Example.Factory;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.EmailMessage;
import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.EmailSendingService;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.Sender;

public class EmailFactory implements Factory {
	@Override
	public Message createMessage() {
		return new EmailMessage();
	}

	@Override
	public Sender createSenderService() {
		return new EmailSendingService();
	}
}
