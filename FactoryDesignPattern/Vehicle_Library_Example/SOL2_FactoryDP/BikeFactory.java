package FactoryDesignPattern.Vehicle_Library_Example.SOL2_FactoryDP;

class BikeFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    System.out.println("BikeFactory Created Bike Object");
    return new Bike();
  }
}
