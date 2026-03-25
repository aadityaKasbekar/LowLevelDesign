from abc import ABC

from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.EmailNotificationFactory import \
	EmailNotificationFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.InterfaceFactory import InterfaceFactory
from AbstractFactoryDesignPattern.NotificationService_Example_Python.Factory.SMSNotificationFactory import \
	SMSNotificationFactory


class AbstractNotificationFactory(ABC):

	@staticmethod
	def getNotificationFactory(notificationMode: str) -> InterfaceFactory:
		if notificationMode == "email":
			return EmailNotificationFactory()
		elif notificationMode == "sms":
			return SMSNotificationFactory()
		return SMSNotificationFactory()
