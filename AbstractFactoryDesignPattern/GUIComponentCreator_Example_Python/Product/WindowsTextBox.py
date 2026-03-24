from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.TextBox import TextBox


class WindowsTextBox(TextBox):

	def showText(self, text: str) -> None:
		print(f"The WindowsTextBox is working fine. Here is the text: {text}")
