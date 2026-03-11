from Client import Client
from Vehicles.Vehicle import Vehicle
from VehiclesFactory.CarFactory import CarFactory
from VehiclesFactory.BikeFactory import BikeFactory
from VehiclesFactory.TruckFactory import TruckFactory

class Driver():

  @staticmethod
  def main():
    client1: Client = Client(CarFactory())
    client2: Client = Client(BikeFactory())
    client3: Client = Client(TruckFactory())

    veh1CreatedByClient1: Vehicle = client1.getCreatedVehicle()
    veh2CreatedByClient2: Vehicle = client2.getCreatedVehicle()
    veh3CreatedByClient3: Vehicle = client3.getCreatedVehicle()

    veh1CreatedByClient1.describe()
    veh2CreatedByClient2.describe()
    veh3CreatedByClient3.describe()

    print(veh1CreatedByClient1.getregistrationInfo())
    print(veh2CreatedByClient2.getregistrationInfo())
    print(veh3CreatedByClient3.getregistrationInfo())

if __name__ == "__main__":
  Driver.main()