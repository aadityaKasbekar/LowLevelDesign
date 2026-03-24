from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.FactoryInterface import FactoryInterface
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.Button import Button
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.MacButton import MacButton
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.MacTextBox import MacTextBox
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.TextBox import TextBox


class MacFactory(FactoryInterface):

	def createButton(self) -> Button:
		return MacButton()

	def createTextBox(self) -> TextBox:
		return MacTextBox()
