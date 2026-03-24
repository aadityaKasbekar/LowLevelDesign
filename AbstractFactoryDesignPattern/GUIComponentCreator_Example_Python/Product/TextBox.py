from abc import ABC, abstractmethod


class TextBox(ABC):

	@abstractmethod
	def showText(self, text: str) -> None:
		pass
