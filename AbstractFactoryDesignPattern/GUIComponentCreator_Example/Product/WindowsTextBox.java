package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product;

public class WindowsTextBox implements TextBox {
	@Override
	public void showText(String text) {
		System.out.println("The text is show in Win Text Box. Text: " + text);
	}
}
