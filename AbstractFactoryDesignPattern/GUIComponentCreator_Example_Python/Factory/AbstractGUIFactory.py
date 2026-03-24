from abc import ABC

from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.MacFactory import MacFactory
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.WindowsFactory import WindowsFactory


class AbstractGUIFactory(ABC):

	@staticmethod
	def getMacFactory() -> MacFactory:
		return MacFactory()

	@staticmethod
	def getWindowsFactory() -> WindowsFactory:
		return WindowsFactory()