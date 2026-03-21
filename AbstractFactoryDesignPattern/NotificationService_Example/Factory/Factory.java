package AbstractFactoryDesignPattern.NotificationService_Example.Factory;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.Sender;

public interface Factory {
	Message createMessage();
	Sender createSenderService();
}
