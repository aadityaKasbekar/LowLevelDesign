package BuilderDesignPattern.Desktop_Example;

abstract class DesktopBuilder {
	protected Desktop desktop;

	public DesktopBuilder() {
		this.desktop = new Desktop();
	}

	public abstract void buildMonitor();

	public abstract void buildKeyboard();

	public abstract void buildMouse();

	public abstract void buildSpeakers();

	public abstract void buildRam();

	public abstract void buildProcessor();

	public abstract void buildMotherboard();

	public Desktop getDesktop() {
		return this.desktop;
	}

}
