import sys

from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.AbstractNotificationFactory import \
	AbstractNotificationFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.InterfaceFactory import InterfaceFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.NotificationService import \
	NotificationService


class Driver:

	@staticmethod
	def main() -> None:
		userInput: str = ""
		while userInput != "exit":
			print("""Please Select the Mode of Notification:
			1. email
			2. sms""")

			inputMode : str = sys.stdin.readline()
			userModeInput : str = inputMode if len(inputMode) > 1 else "not given"
			notifyFactory : InterfaceFactory = AbstractNotificationFactory.getNotificationFactory(userModeInput.lower().strip())

			message : NotificationMessage = notifyFactory.createMessage()
			messageSendingService : NotificationService = notifyFactory.createSenderService()

			print("Please provide the following details:")
			print("Note: the SMS message can only be 160 Character Long.")
			print("Recipient Phone Number or Email Address:")
			inputRecipient: str = sys.stdin.readline()
			print("Message for Recipient:")
			inputMessageBody: str = sys.stdin.readline()
			message.setContent(inputRecipient.lower().strip(), inputMessageBody.strip())
			messageSendingService.sendMessage(message)

			print("If you want to exit please type exit. Otherwise press enter.")
			userInput: str = sys.stdin.readline()
			userInput = userInput.lower().strip()

		sys.exit(0)

if __name__ == "__main__":
	Driver.main()