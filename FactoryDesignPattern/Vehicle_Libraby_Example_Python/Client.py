from Vehicles.Vehicle import Vehicle
from VehiclesFactory.VehicleFactory import VehicleFactory

class Client():

  def __init__(self, vehicleFactory: VehicleFactory) -> None:
    self.createdVehicle = vehicleFactory.createVehicle()

  def getCreatedVehicle(self) -> Vehicle:
    return self.createdVehicle