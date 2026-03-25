from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.InterfaceFactory import InterfaceFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.SMSMessage import SMSMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.NotificationService import \
	NotificationService
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.SMSSendingService import \
	SMSSendingService


class SMSNotificationFactory(InterfaceFactory):

	def createMessage(self) -> NotificationMessage:
		return SMSMessage()

	def createSenderService(self) -> NotificationService:
		return SMSSendingService()
