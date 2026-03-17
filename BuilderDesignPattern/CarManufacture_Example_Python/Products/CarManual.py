from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Product import Product
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType


class CarManual(Product):
	_model: str
	_type: CarsType
	_seat: int
	_engine: Engine
	_transmission: Transmission
	_tripComputer: TripComputer
	_gpsNavigator: GPSNavigator

	def __init__(self, model: str, carType: CarsType, seat: int, engine: Engine, transmission: Transmission, tripComputer: TripComputer, gpsNavigator: GPSNavigator):
		self._model = model
		self._type = carType
		self._seat = seat
		self._engine = engine
		self._transmission = transmission
		self._tripComputer = tripComputer
		self._gpsNavigator = gpsNavigator

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