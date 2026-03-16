package BuilderDesignPattern.CarManufacture_Example.Builders;

import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;
import BuilderDesignPattern.CarManufacture_Example.Products.Car;

public class CarBuilder implements Builder<Car> {
	private String model;
	private CarsType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	/**
	 * @param carModel
	 * string, name of the car
	 */
	@Override
	public void setCarModel(String carModel) {
		this.model = carModel;
	}

	/**
	 * @param carType
	 * enum for the type of car.
	 */
	public void setCarType(CarsType carType) {
		this.type = carType;
	}

	/**
	 * @param seats
	 * int for the seats of car.
	 */
	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @param engine
	 * engine for the engine of car.
	 */
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @param transmission
	 * transmission for the transmission of car.
	 */
	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	/**
	 * @param tripComputer
	 * tripComputer for the tripComputer of car.
	 */
	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	/**
	 * @param gpsNavigator
	 * gpsNavigator for the gpsNavigator of car.
	 */
	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	@Override
	public Car getResults() {
		return new Car(model, type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
