package BuilderDesignPattern.CarManufacture_Example.Directors;

import BuilderDesignPattern.CarManufacture_Example.Builders.Builder;
import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;
import BuilderDesignPattern.CarManufacture_Example.Products.Product;

public class Director {
	public <T extends Product> T constructSportsCar(Builder<T> builder) {
		builder.setCarModel("HONDA Prelude");
		builder.setCarType(CarsType.SPORTS);
		builder.setSeats(2);
		builder.setEngine(new Engine(3000, 25));
		builder.setTransmission(Transmission.MANUAL);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		return builder.getResults();
	}

	public <T extends Product> T constructSedanCar(Builder<T> builder) {
		builder.setCarModel("TOYOTA Camry");
		builder.setCarType(CarsType.SEDAN);
		builder.setSeats(4);
		builder.setEngine(new Engine(2500, 350));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		return builder.getResults();
	}

	public <T extends Product> T constructSUVCar(Builder<T> builder) {
		builder.setCarModel("TOYOTA 4Runner");
		builder.setCarType(CarsType.SUV);
		builder.setSeats(5);
		builder.setEngine(new Engine(5500, 50));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		return builder.getResults();
	}

	public <T extends Product> T constructElectricCar(Builder<T> builder) {
		builder.setCarModel("RIVIAN R1S");
		builder.setCarType(CarsType.ELECTRIC);
		builder.setSeats(5);
		builder.setEngine(new Engine(0, 50));
		builder.setTransmission(Transmission.SINGLE_SPEED);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		return builder.getResults();
	}
}
