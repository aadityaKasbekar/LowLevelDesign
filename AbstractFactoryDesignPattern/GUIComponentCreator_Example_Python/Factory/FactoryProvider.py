from abc import ABC

from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.AbstractGUIFactory import AbstractGUIFactory
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.FactoryInterface import FactoryInterface


class FactoryProvider(ABC):

	@staticmethod
	def getGUIFactory(guiType: str) -> FactoryInterface:
		if guiType == "mac":
			return AbstractGUIFactory.getMacFactory()
		elif guiType == "win":
			return AbstractGUIFactory.getWindowsFactory()
		return AbstractGUIFactory.getMacFactory()
