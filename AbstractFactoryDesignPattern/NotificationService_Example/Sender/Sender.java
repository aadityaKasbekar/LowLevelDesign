package AbstractFactoryDesignPattern.NotificationService_Example.Sender;

import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;

public interface Sender {
	void sendMessage(Message message);
}
