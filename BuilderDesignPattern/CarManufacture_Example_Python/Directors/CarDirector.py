from typing import TypeVar, Generic

from BuilderDesignPattern.CarManufacture_Example_Python.Builders.Builder import Builder
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Car import Car
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Product import Product
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType

T = TypeVar('T', bound=Product)
class CarDirector:
	def constructSportsCar(self, builder: Builder[T]) -> T:
		return (builder.setCarModel("HONDA Prelude")
		 .setCarType(CarsType.HYBRID)
		 .buildSeats(2)
		 .buildEngine(Engine(3500, 25))
		 .buildTransmission(Transmission.AUTOMATIC)
		 .buildTripComputer(TripComputer())
		 .buildGPSNavigator(GPSNavigator())
		 .build())

	def constructSedanCar(self, builder: Builder[T]) -> T:
		return (builder.setCarModel("TOYOTA Camry")
		 .setCarType(CarsType.HYBRID)
		 .buildSeats(4)
		 .buildEngine(Engine(2000, 250))
		 .buildTransmission(Transmission.AUTOMATIC)
		 .buildTripComputer(TripComputer())
		 .buildGPSNavigator(GPSNavigator())
		 .build())

	def constructSUVCar(self, builder: Builder[T]) -> T:
		return (builder.setCarModel("TOYOTA 4Runner")
				.setCarType(CarsType.HYBRID)
				.buildSeats(4)
				.buildEngine(Engine(3500, 50))
				.buildTransmission(Transmission.AUTOMATIC)
				.buildTripComputer(TripComputer())
				.buildGPSNavigator(GPSNavigator())
				.build())

	def constructElectricCar(self, builder: Builder[T]) -> T:
		return (builder.setCarModel("Rivian R1S")
				.setCarType(CarsType.ELECTRIC)
				.buildSeats(5)
				.buildEngine(Engine(0, 5))
				.buildTransmission(Transmission.SINGLE_SPEED)
				.buildTripComputer(TripComputer())
				.buildGPSNavigator(GPSNavigator())
				.build())