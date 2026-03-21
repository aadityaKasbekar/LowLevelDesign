package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product;

public class MacTextBox implements TextBox {
	@Override
	public void showText(String text) {
		System.out.println("The text is show in Mac Text Box. Text: " + text);
	}
}
