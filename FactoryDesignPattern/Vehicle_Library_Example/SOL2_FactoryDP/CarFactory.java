package FactoryDesignPattern.Vehicle_Library_Example.SOL2_FactoryDP;

class CarFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    System.out.println("CarFactory Created Car Object");
    return new Car();
  }
}
