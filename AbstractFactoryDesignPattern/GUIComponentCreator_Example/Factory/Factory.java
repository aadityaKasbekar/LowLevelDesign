package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory;

import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.Button;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.TextBox;

public interface Factory {
	Button createButton();
	TextBox createTextBox();
}
