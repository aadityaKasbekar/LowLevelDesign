package FactoryDesignPattern.Vehicle_Library_Example.SOL2_FactoryDP;

class Client {
  private Vehicle demoVehicle;

  public Client(VehicleFactory factory) {
    demoVehicle = factory.createVehicle();
  }

  public Vehicle getVehicle() {
    return demoVehicle;
  }
}
