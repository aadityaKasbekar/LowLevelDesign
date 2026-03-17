from typing import Final

from BuilderDesignPattern.CarManufacture_Example_Python.Components.Engine import Engine
from BuilderDesignPattern.CarManufacture_Example_Python.Components.GPSNavigator import GPSNavigator
from BuilderDesignPattern.CarManufacture_Example_Python.Components.Transmission import Transmission
from BuilderDesignPattern.CarManufacture_Example_Python.Components.TripComputer import TripComputer
from BuilderDesignPattern.CarManufacture_Example_Python.Products.Product import Product
from BuilderDesignPattern.CarManufacture_Example_Python.ProductsTypes.CarsType import CarsType


class Car(Product):

	def __init__(self, model: str, carsType: CarsType, seat: int, engine: Engine, trans: Transmission, tripComp: TripComputer, gpsNav: GPSNavigator):
		super().__init__()
		self._model: Final[ str ] = model
		self._type: Final[ CarsType ] = carsType
		self._seat: Final[ int ] = seat
		self._engine: Final[ Engine ] = engine
		self._transmission: Final[ Transmission ] = trans
		self._tripComputer: Final[ TripComputer ] = tripComp
		self._gpsNavigator: Final[ GPSNavigator ] = gpsNav
		self._fuel: int = 0
		if self._tripComputer is not None:
			self._tripComputer.setCar(self)

	def getModel(self) -> str:
		return self._model

	def getCarType(self) -> CarsType:
		return self._type

	def getSeat(self) -> int:
		return self._seat

	def getEngine(self) -> Engine:
		return self._engine

	def getTransmission(self) -> Transmission:
		return self._transmission

	def getTripComputer(self) -> TripComputer:
		return self._tripComputer

	def getGPSNavigator(self) -> GPSNavigator:
		return self._gpsNavigator

	def getFuel(self) -> int:
		return self._fuel

	def setFuel(self, fuel: int) -> None:
		self._fuel = fuel

	def __str__(self) -> str:
		trip_comp = "Functional" if self._tripComputer is not None else "N/A"
		gps_nav = "Functional" if self._gpsNavigator is not None else "N/A"

		return (
			f"\nCar Information\n"
			f"Name of car: {self._model}\n"
			f"Type of car: {self._type}\n"
			f"Count of seats: {self._seat}\n"
			f"Engine: volume - {self._engine.getVolume()}; mileage - {self._engine.getMileage()}\n"
			f"Transmission: {self._transmission}\n"
			f"Trip Computer: {trip_comp}\n"
			f"GPS Navigator: {gps_nav}\n"
		)
