package AbstractFactoryDesignPattern.GUIComponentCreator_Example;

import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory.Factory;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory.GUIFactory;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.Button;
import AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product.TextBox;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Please Select the OS Type:");
		System.out.println("1. Windows - type windows");
		System.out.println("2. Mac - type mac");
		String osType = scannerObj.nextLine();

		Factory factory = GUIFactory.createFactory(osType);

		Button button1 = factory.createButton();
		TextBox textBox1 = factory.createTextBox();

		button1.pressed();
		textBox1.showText("Hello");
	}
}
