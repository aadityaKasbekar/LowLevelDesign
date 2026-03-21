package AbstractFactoryDesignPattern.NotificationService_Example.Factory;

public abstract class NotificationFactory {

	public static Factory createFactory(String factoryType) {
		if (factoryType.equals("email")) {
			return new EmailFactory();
		}
		else if (factoryType.equals("sms")) {
			return new SMSFactory();
		}
		return new EmailFactory();
	}
}
