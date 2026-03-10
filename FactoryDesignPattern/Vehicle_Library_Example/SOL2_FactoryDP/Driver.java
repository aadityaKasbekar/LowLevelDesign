package FactoryDesignPattern.Vehicle_Library_Example.SOL2_FactoryDP;

public class Driver {
  public static void main(String[] agrs) {
    VehicleFactory carFactory = new CarFactory();
    VehicleFactory bikeFactory = new BikeFactory();

    Client client1 = new Client(carFactory);
    Vehicle veh1 = client1.getVehicle();
    System.out.println("Client1 got veh1:");
    veh1.printVehicle();

    Client client2 = new Client(bikeFactory);
    Vehicle veh2 = client2.getVehicle();
    System.out.println("Client2 got veh2:");
    veh2.printVehicle();
  }
}
