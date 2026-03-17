from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Product import Product
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType


class CarManual(Product):

	def __init__(self, model: str, carType: CarsType, seat: int, engine: Engine, transmission: Transmission, tripComputer: TripComputer, gpsNavigator: GPSNavigator):
		super().__init__()
		self._model: str = model
		self._type: CarsType = carType
		self._seat: int = seat
		self._engine: Engine = engine
		self._transmission: Transmission = transmission
		self._tripComputer: TripComputer = tripComputer
		self._gpsNavigator: GPSNavigator = gpsNavigator

	def __str__(self) -> str:
		trip_comp = "Functional" if self._tripComputer is not None else "N/A"
		gps_nav = "Functional" if self._gpsNavigator is not None else "N/A"

		return (
			f"\nCar Manual\n"
			f"Name of car: {self._model}\n"
			f"Type of car: {self._type}\n"
			f"Count of seats: {self._seat}\n"
			f"Engine: volume - {self._engine.getVolume()}; mileage - {self._engine.getMileage()}\n"
			f"Transmission: {self._transmission}\n"
			f"Trip Computer: {trip_comp}\n"
			f"GPS Navigator: {gps_nav}\n"
		)