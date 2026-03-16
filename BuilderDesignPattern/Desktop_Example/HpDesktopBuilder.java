package BuilderDesignPattern.Desktop_Example;

public class HpDesktopBuilder extends DesktopBuilder{

	public void buildMonitor() {
		desktop.setMonitor("HP MONITOR");
	}

	public void buildKeyboard() {
		desktop.setKeyboard("HP KEYBOARD");
	}

	public void buildMouse() {
		desktop.setMouse("HP MOUSE");
	}

	public void buildSpeakers() {
		desktop.setSpeakers("HP SPEAKERS");
	}

	public void buildRam() {
		desktop.setRam("HP RAM");
	}

	public void buildProcessor() {
		desktop.setProcessor("HP PROCESSOR");
	}

	public void buildMotherboard() {
		desktop.setMotherboard("HP MOTHERBOARD");
	}
}
