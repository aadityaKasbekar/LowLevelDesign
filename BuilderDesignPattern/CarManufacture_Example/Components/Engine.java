package BuilderDesignPattern.CarManufacture_Example.Components;

public class Engine {
	private final int volume;
	private long mileage;
	private boolean started;

	public Engine(int engineVolume, long engineMileage) {
		this.volume = engineVolume;
		this.mileage = engineMileage;
	}

	public void turnOn() {
		this.started = true;
	}

	public void turnOff() {
		this.started = false;
	}

	public boolean isStarted() {
		return started;
	}

	public void go(long miles) {
		if (this.started) {
			this.mileage += miles;
		} else {
			System.out.println("Cannot go(). First Start the Car.");
		}
	}

	public int getVolume() {
		return this.volume;
	}

	public long getMileage() {
		return this.mileage;
	}
}
