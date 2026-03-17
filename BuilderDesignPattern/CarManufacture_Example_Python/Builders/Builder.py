from typing import TypeVar, Generic
from abc import ABC, abstractmethod

from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Product import Product
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Car import Car

T = TypeVar('T', bound=Product)
class Builder(ABC, Generic[T]):
	def __init__(self):
		pass

	@abstractmethod
	def setCarModel(self, model: str) -> "Builder":
		pass

	@abstractmethod
	def setCarType(self, type: CarsType) -> "Builder":
		pass

	@abstractmethod
	def buildSeats(self, seats: int) -> "Builder":
		pass

	@abstractmethod
	def buildEngine(self, engine: Engine) -> "Builder":
		pass

	@abstractmethod
	def buildTransmission(self, transmission: Transmission) -> "Builder":
		pass

	@abstractmethod
	def buildTripComputer(self, tripComp: TripComputer) -> "Builder":
		pass

	@abstractmethod
	def buildGPSNavigator(self, gpsNAV: GPSNavigator) -> "Builder":
		pass

	@abstractmethod
	def build(self) -> T:
		pass