from datetime import datetime
from Vehicles.Vehicle import Vehicle
from Vehicles.Car import Car
from VehiclesFactory.VehicleFactory import VehicleFactory

class CarFactory(VehicleFactory):

  def createVehicle(self) -> Vehicle:
    return Car("Honda", datetime(2025, 1, 19), "Accord", 4757, "CA", "Black", True, "Automatic", "Hybrid")