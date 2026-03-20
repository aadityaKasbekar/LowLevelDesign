package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory;

import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.Button;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.MacButton;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.MacTextBox;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.TextBox;

public class MacFactory implements Factory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextBox createTextBox() {
		return new MacTextBox();
	}
}
