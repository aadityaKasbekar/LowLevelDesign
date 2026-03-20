package AbstractFactoryDesignPattern.GUIComponentCreator_Example.Factory;

public abstract class GUIFactory {

	public static Factory createFactory(String osType) {
		if (osType.equals("mac")) {
			return new MacFactory();
		}
		else if (osType.equals("windows")) {
			return new WindowsFactory();
		}
		return new MacFactory();
	}
}
