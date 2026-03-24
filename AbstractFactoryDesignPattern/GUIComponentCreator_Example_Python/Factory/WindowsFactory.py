from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Factory.FactoryInterface import FactoryInterface
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.Button import Button
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.TextBox import TextBox
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.WindowsButton import WindowsButton
from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.WindowsTextBox import WindowsTextBox


class WindowsFactory(FactoryInterface):

	def createButton(self) -> Button:
		return WindowsButton()

	def createTextBox(self) -> TextBox:
		return WindowsTextBox()
