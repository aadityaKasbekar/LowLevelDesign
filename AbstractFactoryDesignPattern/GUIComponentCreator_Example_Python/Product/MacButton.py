from AbstractFactoryDesignPattern.GUIComponentCreator_Example_Python.Product.Button import Button


class MacButton(Button):

	def pressed(self) -> None:
		print(f"MacButton is pressed. It is working fine.")
