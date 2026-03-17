package BuilderDesignPattern.Desktop_Example.Builders;

public class DellDektopBuilder extends DesktopBuilder {

	public void buildMonitor() {
		desktop.setMonitor("DELL MONITOR");
	}

	public void buildKeyboard() {
		desktop.setKeyboard("DELL KEYBOARD");
	}

	public void buildMouse() {
		desktop.setMouse("DELL MOUSE");
	}

	public void buildSpeakers() {
		desktop.setSpeakers("DELL SPEAKERS");
	}

	public void buildRam() {
		desktop.setRam("DELL RAM");
	}

	public void buildProcessor() {
		desktop.setProcessor("DELL PROCESSOR");
	}

	public void buildMotherboard() {
		desktop.setMotherboard("DELL MOTHERBOARD");
	}
}
