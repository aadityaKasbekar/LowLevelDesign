from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.Button import Button


class WindowsButton(Button):

	def pressed(self) -> None:
		print(f"Windows button is pressed. It is working fine.")
