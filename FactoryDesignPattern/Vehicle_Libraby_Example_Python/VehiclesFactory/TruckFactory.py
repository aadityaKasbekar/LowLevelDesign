from datetime import datetime
from Vehicles.Vehicle import Vehicle
from Vehicles.Truck import Truck
from VehiclesFactory.VehicleFactory import VehicleFactory

class TruckFactory(VehicleFactory):

  def createVehicle(self) -> Vehicle:
    return Truck("Volvo", datetime(2015, 12, 1), "VNL", 135472, "MA", "Golden", True, 500)