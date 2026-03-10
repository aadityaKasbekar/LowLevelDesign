package FactoryDesignPattern.Shapes_Example;

public class Triangle extends Shape {
  private double height;
  private double base;

  public Triangle(double height, double base) {
    this.height = height;
    this.base = base;
  }

  @Override
  protected double area() {
    return 0.5 * this.base * this.height;
  }

  @Override
  public void describe() {
    System.out.printf("This is a Triangle with area: %.2f%n", area());
  }
}
