from Vehicles.Vehicle import Vehicle
from abc import ABC, abstractmethod

class VehicleFactory(ABC):

  @abstractmethod
  def createVehicle(self) -> Vehicle:
    pass

  def describe(self):
    veh: Vehicle = self.createVehicle()
    veh.describe()