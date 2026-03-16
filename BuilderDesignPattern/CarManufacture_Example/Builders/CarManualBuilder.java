package BuilderDesignPattern.CarManufacture_Example.Builders;

import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;
import BuilderDesignPattern.CarManufacture_Example.Products.CarManual;

public class CarManualBuilder implements Builder<CarManual> {
	private String model;
	private CarsType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	/**
	 * @param carModel
	 * string name for the car.
	 */
	@Override
	public void setCarModel(String carModel) {
		this.model = carModel;
	}

	/**
	 * @param carType
	 * enum types of cars.
	 */
	@Override
	public void setCarType(CarsType carType) {
		this.type = carType;
	}

	/**
	 * @param seats
	 * int number of seats for the car.
	 */
	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @param engine
	 * engine for the car.
	 */
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @param transmission
	 * transmission for the car.
	 */
	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	/**
	 * @param tripComputer
	 * tripComputer for the car.
	 */
	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	/**
	 * @param gpsNavigator
	 * gpsNavigator for the car.
	 */
	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	@Override
	public CarManual getResults() {
		return new CarManual(model, type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
