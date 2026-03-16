package BuilderDesignPattern.CarManufacture_Example.Products;

import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;

public class CarManual extends Product {
	private final String model;
	private final CarsType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;

	/**
	 * @param carModel
	 * string name of the car manual.
	 * @param carType
	 * enum for the type of car manual.
	 * @param seats
	 * int number of seats of car manual.
	 * @param engine
	 * engine for the engine of car manual.
	 * @param transmission
	 * transmission for the transmission of car manual.
	 * @param tripComputer
	 * tripComputer for the tripComputer of car manual.
	 * @param gpsNavigator
	 * gpsNavigator for the gpsNavigator of car manual.
	 */
	public CarManual(String carModel, CarsType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.model  = carModel;
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
		this.transmission = transmission;
	}

	public String print() {
		String info = "\nCar Manual \n";
		info += "Name of car: " + model + "\n";
		info += "Type of car: " + carType + "\n";
		info += "Count of seats: " + seats + "\n";
		info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
		info += "Transmission: " + transmission + "\n";
		if (this.tripComputer != null) {
			info += "Trip Computer: Functional" + "\n";
		} else {
			info += "Trip Computer: N/A" + "\n";
		}
		if (this.gpsNavigator != null) {
			info += "GPS Navigator: Functional" + "\n";
		} else {
			info += "GPS Navigator: N/A" + "\n";
		}
		return info;
	}
}
