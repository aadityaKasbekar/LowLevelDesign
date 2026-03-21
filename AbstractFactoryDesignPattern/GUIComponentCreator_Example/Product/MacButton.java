package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Product;

public class MacButton implements Button {
	@Override
	public void pressed() {
		System.out.println("Mac Button was Pressed.");
	}
}
