package BuilderDesignPattern.Email_Example;

import BuilderDesignPattern.Email_Example.Director.Director;
import BuilderDesignPattern.Email_Example.ProductTypes.EmailPriorityType;
import BuilderDesignPattern.Email_Example.Products.Email;

public class Driver {
	public static void main(String[] agrs) {
		Director director = new Director();
		Email outOfOffice = director.outOfOffice("latestSendersEmail@automated.com");

		Email email1 = new Email.Builder("kartikraut@gmail.com", "Meeting Details for 3rd March 2026 as Follows:")
							   .setBody("Hi Kartik,\nHope tou are doing well. These are teh details for the StackHolders meeting details in below:\n...\nI have also attached the PRD.pdf to this email for your reference. Thank you.\n\nKind Regards\nAaditya Kasbekar.")
							   .addAttachment("/ImaportantDocuments/Projects/Abhi Corona Lega/PRD.pdf")
							   .addCCRecipient("sudhanvapaturkar@outlook.com", "akshaychanvan@yahoo.com")
							   .addBCCRecipients("sakshiwadaskar@gmail.com")
							   .changePriority(EmailPriorityType.HIGH)
							   .build();

		System.out.println(outOfOffice);
		System.out.println(email1);
	}
}
