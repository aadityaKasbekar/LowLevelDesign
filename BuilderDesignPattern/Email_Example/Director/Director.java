package BuilderDesignPattern.Email_Example.Director;

import BuilderDesignPattern.Email_Example.Products.Email;

public class Director {
	public Email outOfOffice(String recipient) {
		return new Email.Builder(recipient, "Out of Office till 31st March 2025")
					   .addCCRecipient("aadityakasbekar2@gmail.com", "kartik28@gmail.com")
					   .setBody("Hi,\nI am Aaditya currently out of office till 31st March. If you require any urgent assistance or support my team member Kartik Raut will be able to help.\nHis email is kartik28@gmail.com.\nSee you soon. Thank you.\n\nKind Regards\nAaditya Kasbekar\n")
					   .build();
	}
}
