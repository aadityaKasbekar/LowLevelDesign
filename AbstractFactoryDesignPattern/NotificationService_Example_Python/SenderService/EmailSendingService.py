from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.NotificationService import \
	NotificationService


class EmailSendingService(NotificationService):

	def sendMessage(self, message: NotificationMessage) -> None:
		print(f"Sending Notification Message VIA SMTP: {message.formatMessage()}")
