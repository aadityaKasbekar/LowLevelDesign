from BuilderDesignPattern.CarManufacture_Example_Python.Builders.Builder import Builder
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Car import Car


class CarBuilder(Builder[Car]):
	_model: str
	_type: CarsType
	_seat: int
	_engine: Engine
	_transmission: Transmission
	_tripComputer: TripComputer
	_gpsNavigator: GPSNavigator

	def setCarModel(self, carName: str) -> Builder:
		self._model = carName
		return self

	def setCarType(self, carType: CarsType) -> Builder:
		self._type = carType
		return self

	def buildSeats(self, numSeats: int) -> Builder:
		self._seat = numSeats
		return self

	def buildEngine(self, carEngine: Engine) -> Builder:
		self._engine = carEngine
		return self

	def buildTransmission(self, carTransmission: Transmission) -> Builder:
		self._transmission = carTransmission
		return self
	
	def buildTripComputer(self, carTripComputer: TripComputer) -> Builder:
		self._tripComputer = carTripComputer
		return self

	def buildGPSNavigator(self, carGPSNav: GPSNavigator) -> Builder:
		self._gpsNavigator = carGPSNav
		return self

	def build(self) -> Car:
		return Car(self._model, self._type, self._seat, self._engine, self._transmission, self._tripComputer, self._gpsNavigator)