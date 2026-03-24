from abc import ABC, abstractmethod

from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.Button import Button
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.TextBox import TextBox


class FactoryInterface(ABC):

	@abstractmethod
	def createButton(self) -> Button:
		pass

	@abstractmethod
	def createTextBox(self) -> TextBox:
		pass
