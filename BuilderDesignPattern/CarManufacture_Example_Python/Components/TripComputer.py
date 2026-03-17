from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from BuilderDesignPattern.CarManufacture_Example_Python.Products.Car import Car


class TripComputer:
    def __init__(self):
        self._car: "Car" = None

    def setCar(self, car: "Car"):
        self._car = car

    def showFuelLevel(self):
        if self._car:
            print(f"Fuel Level: {self._car.getFuel()}")
        else:
            print("Trip Computer not connected to a car.")

    def showStatus(self):
        if self._car.getEngine().isStarted():
            print(f"Car is Started.")
        else:
            print(f"Car is Turned off.")