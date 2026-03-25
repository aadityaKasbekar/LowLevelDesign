from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.TextBox import TextBox


class MacTextBox(TextBox):

	def showText(self, text: str) -> None:
		print(f"The MacTextBox is working fine. Here is the text: {text}")
