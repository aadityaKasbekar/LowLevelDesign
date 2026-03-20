package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product;

public class WindowsButton implements Button {
	@Override
	public void pressed() {
		System.out.println("Win Button was Pressed.");
	}
}
