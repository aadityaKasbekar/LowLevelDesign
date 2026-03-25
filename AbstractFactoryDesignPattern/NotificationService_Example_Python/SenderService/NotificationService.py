from abc import ABC, abstractmethod

from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import \
	NotificationMessage


class NotificationService(ABC):

	@abstractmethod
	def sendMessage(self, message: NotificationMessage) -> None:
		pass
