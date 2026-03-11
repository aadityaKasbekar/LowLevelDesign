from datetime import datetime
from Vehicles.Vehicle import Vehicle
from Vehicles.Bike import Bike
from VehiclesFactory.VehicleFactory import VehicleFactory

class BikeFactory(VehicleFactory):

  def createVehicle(self) -> Vehicle:
    return Bike("Yamaha", datetime(2023, 2, 23), "R1", 1547, "CA", "Blue", True, 1000)