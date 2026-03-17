from abc import ABC, abstractmethod

from BuilderDesignPattern.Destop_Example_Python.Products.Desktop import Desktop


class DesktopBuilder(ABC):
	_desktop: Desktop

	def __init__(self):
		self._desktop = Desktop()

	@abstractmethod
	def buildMonitor(self):
		pass

	@abstractmethod
	def buildKeyboard(self):
		pass

	@abstractmethod
	def buildMouse(self):
		pass

	@abstractmethod
	def buildSpeakers(self):
		pass

	@abstractmethod
	def buildRam(self):
		pass

	@abstractmethod
	def buildProcessor(self):
		pass

	@abstractmethod
	def buildMotherboard(self):
		pass

	def getDesktop(self) -> Desktop:
		return self._desktop
