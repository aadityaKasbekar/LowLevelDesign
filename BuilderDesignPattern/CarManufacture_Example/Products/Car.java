package BuilderDesignPattern.CarManufacture_Example.Products;

import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;

public class Car extends Product {
	private final String model;
	private final CarsType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;


	/**
	 * @param carModel
	 * string name of the car.
	 * @param carType
	 * enum for the type of car.
	 * @param seats
	 * int number of seats of car.
	 * @param engine
	 * engine for the engine of car.
	 * @param transmission
	 * transmission for the transmission of car.
	 * @param tripComputer
	 * tripComputer for the tripComputer of car.
	 * @param gpsNavigator
	 * gpsNavigator for the gpsNavigator of car.
	 */
	public Car(String carModel, CarsType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.model = carModel;
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.gpsNavigator = gpsNavigator;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if (this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
	}

	public String getCarModel() {
		return this.model;
	}

	public CarsType getCarType() {
		return this.carType;
	}

	public int getSeats() {
		return this.seats;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public TripComputer getTripComputer() {
		return this.tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return this.gpsNavigator;
	}

	public Transmission getTransmission() {
		return this.transmission;
	}

	public double getFuel() {
		return this.fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public String print() {
		String carString = "\nCar Information \n";
		carString += "Name of car: " + model + "\n";
		carString += "Type of car: " + carType + "\n";
		carString += "Count of seats: " + seats + "\n";
		carString += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
		carString += "Transmission: " + transmission + "\n";
		if (this.tripComputer != null) {
			carString += "Trip Computer: Functional" + "\n";
		} else {
			carString += "Trip Computer: N/A" + "\n";
		}
		if (this.gpsNavigator != null) {
			carString += "GPS Navigator: Functional" + "\n";
		} else {
			carString += "GPS Navigator: N/A" + "\n";
		}
		return carString;
	}
}
