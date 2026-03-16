package BuilderDesignPattern.CarManufacture_Example.Components;

import BuilderDesignPattern.CarManufacture_Example.Products.Car;

public class TripComputer {
	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void showFuelLevel() {
		System.out.println("Fuel Level: " + car.getFuel());
	}

	public void showStatus() {
		if (this.car.getEngine().isStarted()) {
			System.out.println("Car is Started.");
		} else {
			System.out.println("Car is not Started.");
		}
	}
}
