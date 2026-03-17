from BuilderDesignPattern.CarManufacture_Example_Python.Builders.CarBuilder import CarBuilder
from BuilderDesignPattern.CarManufacture_Example_Python.Builders.CarManualBuilder import CarManualBuilder
from BuilderDesignPattern.CarManufacture_Example_Python.Directors.CarDirector import CarDirector
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Car import Car
from BuilderDesignPattern.CarManufacture_Example_Python.Products.CarManual import CarManual
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType


class Driver:
	@staticmethod
	def main():

		director: CarDirector = CarDirector()
		carBuilder: CarBuilder = CarBuilder()
		customCarBuilder: CarBuilder = CarBuilder()
		carManualBuilder: CarManualBuilder = CarManualBuilder()

		car1: Car = director.constructSportsCar(carBuilder)
		car2: Car = director.constructElectricCar(carBuilder)
		car3: Car = director.constructSedanCar(carBuilder)
		car4: Car = director.constructSUVCar(carBuilder)
		car5: Car = (customCarBuilder.setCarModel("HONDA Accord")
					 .setCarType(CarsType.HYBRID)
					 .buildSeats(4)
					 .buildEngine(Engine(2500, 47))
					 .buildTransmission(Transmission.AUTOMATIC)
					 .buildTripComputer(TripComputer())
					 .buildGPSNavigator(GPSNavigator())
					 .build())

		carManual1: CarManual = director.constructSportsCar(carManualBuilder)

		print(car1)
		print(car2)
		print(car3)
		print(car4)
		print(car5)

		print(carManual1)

if __name__ == "__main__":
	Driver.main()