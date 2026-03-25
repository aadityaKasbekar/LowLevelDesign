from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.InterfaceFactory import InterfaceFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.EmailMessage import EmailMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.EmailSendingService import \
	EmailSendingService
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.NotificationService import \
	NotificationService


class EmailNotificationFactory(InterfaceFactory):

	def createMessage(self) -> NotificationMessage:
		return EmailMessage()

	def createSenderService(self) -> NotificationService:
		return EmailSendingService()
