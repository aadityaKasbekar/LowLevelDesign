from abc import ABC, abstractmethod

from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage
from AbstractFactoryDesignPattern.NotificationService_Example_Python.SenderService.NotificationService import \
	NotificationService


class InterfaceFactory(ABC):

	@abstractmethod
	def createMessage(self) -> NotificationMessage:
		pass

	@abstractmethod
	def createSenderService(self) -> NotificationService:
		pass
