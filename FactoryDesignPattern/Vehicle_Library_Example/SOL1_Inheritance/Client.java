package FactoryDesignPattern.Vehicle_Library_Example.SOL1_Inheritance;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Vehicle demoVehicle;
    Scanner scannerObj = new Scanner(System.in);

    String vehicleType = scannerObj.nextLine();
    if ("car".equals(vehicleType)) {
      demoVehicle = new Car();
      demoVehicle.createVehicle();
    }
    else if ("bike".equals(vehicleType)) {
      demoVehicle = new Bike();
      demoVehicle.createVehicle();
    }
    scannerObj.close();
  }
}
