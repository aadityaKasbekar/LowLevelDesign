package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory;

import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.Button;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.TextBox;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.WindowsButton;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.WindowsTextBox;

public class WindowsFactory implements Factory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public TextBox createTextBox() {
		return new WindowsTextBox();
	}
}
