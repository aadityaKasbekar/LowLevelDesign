from abc import ABC, abstractmethod

class NotificationMessage(ABC):

	@abstractmethod
	def setContent(self, to : str, body : str) -> None:
		pass

	@abstractmethod
	def formatMessage(self) -> str:
		pass