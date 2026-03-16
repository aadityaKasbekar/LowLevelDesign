package BuilderDesignPattern.CarManufacture_Example.Builders;

import BuilderDesignPattern.CarManufacture_Example.Components.Engine;
import BuilderDesignPattern.CarManufacture_Example.Components.GPSNavigator;
import BuilderDesignPattern.CarManufacture_Example.Components.Transmission;
import BuilderDesignPattern.CarManufacture_Example.Components.TripComputer;
import BuilderDesignPattern.CarManufacture_Example.ProductTypes.CarsType;
import BuilderDesignPattern.CarManufacture_Example.Products.Product;

public interface Builder<T extends Product> {
	void setCarModel(String carModel);
	void setCarType(CarsType carType);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
	T getResults();
}
