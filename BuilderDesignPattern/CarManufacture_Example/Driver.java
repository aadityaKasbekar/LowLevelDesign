package BuilderDesignPattern.CarManufacture_Example;

import BuilderDesignPattern.CarManufacture_Example.Builders.Builder;
import BuilderDesignPattern.CarManufacture_Example.Builders.CarBuilder;
import BuilderDesignPattern.CarManufacture_Example.Builders.CarManualBuilder;
import BuilderDesignPattern.CarManufacture_Example.Directors.Director;
import BuilderDesignPattern.CarManufacture_Example.Products.Car;
import BuilderDesignPattern.CarManufacture_Example.Products.CarManual;

public class Driver {
	public static void main(String[] args) {
		Builder<Car>       carBuilder       = new CarBuilder();
		Builder<CarManual> carManualBuilder = new CarManualBuilder();

		Director director = new Director();

		Car car1 = director.constructSportsCar(carBuilder);
		Car car2 = director.constructSedanCar(carBuilder);
		Car car3 = director.constructSUVCar(carBuilder);
		Car car4 = director.constructElectricCar(carBuilder);

		CarManual carManual1 = director.constructSportsCar(carManualBuilder);
		CarManual carManual2 = director.constructSedanCar(carManualBuilder);
		CarManual carManual3 = director.constructSUVCar(carManualBuilder);
		CarManual carManual4 = director.constructElectricCar(carManualBuilder);

//		System.out.println(car1.print());
//		car1.getEngine().go(200);
//		car1.getEngine().turnOff();
		System.out.println(car1.print());
		System.out.println(car2.print());
		System.out.println(car3.print());
		System.out.println(car4.print());

		System.out.println(carManual1.print());
		System.out.println(carManual2.print());
		System.out.println(carManual3.print());
		System.out.println(carManual4.print());
	}
}
