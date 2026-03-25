import sys

from Factory.FactoryInterface import FactoryInterface
from Factory.FactoryProvider import FactoryProvider
from Product.Button import Button
from Product.TextBox import TextBox


class Driver:

	@staticmethod
	def main() -> None:
		userInput: str = ""
		while userInput != "exit":
			print("""Please Select Which type of GUI Factory Object is needed from below Options: 
            1. mac
            2. win""")
			guiType: str = sys.stdin.readline()
			guiType = guiType.lower().strip()
			guiFactory: FactoryInterface = FactoryProvider.getGUIFactory(guiType)
			print(f"Type of GUI Factory Selected: {type(guiFactory)}")

			button1: Button = guiFactory.createButton()
			textbox1: TextBox = guiFactory.createTextBox()

			button1.pressed()
			textbox1.showText("This is the Text for the Text box. HIIIIIII")
			print("To exit the program type exit below. Otherwise press enter.")
			userInput = sys.stdin.readline()
			userInput = userInput.lower().strip()

		sys.exit(0)


if __name__ == "__main__":
	Driver.main()
