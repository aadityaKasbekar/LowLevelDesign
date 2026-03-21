package AbstractFactoryDesignPattern.NotificationService_Example;

import AbstractFactoryDesignPattern.NotificationService_Example.Factory.Factory;
import AbstractFactoryDesignPattern.NotificationService_Example.Factory.NotificationFactory;
import AbstractFactoryDesignPattern.NotificationService_Example.Message.Message;
import AbstractFactoryDesignPattern.NotificationService_Example.Sender.Sender;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Welcome to notification Service. Please Select Mode of Notification: ");
		System.out.println("1. email\n2. sms");
		String notificationMode = scannerObj.nextLine();

		Factory factory = NotificationFactory.createFactory(notificationMode);
		Message message = factory.createMessage();

		System.out.println("Enter the Following Details: ");
		System.out.println("Note: SMS mode SMS Body has a Character restriction of 160 characters.");
		System.out.println("Recipient Info (phoneNumber or email): ");
		String recipient = scannerObj.nextLine();

		System.out.println("Message Body: ");
		String body = scannerObj.nextLine();

		message.setContent(recipient, body);

		Sender sender = factory.createSenderService();
		sender.sendMessage(message);
		System.out.println("Message sent successfully.");
	}
}
