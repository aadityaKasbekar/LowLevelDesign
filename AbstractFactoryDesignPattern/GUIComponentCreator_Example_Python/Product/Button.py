from abc import ABC, abstractmethod


class Button(ABC):

	@abstractmethod
	def pressed(self) -> None:
		pass
