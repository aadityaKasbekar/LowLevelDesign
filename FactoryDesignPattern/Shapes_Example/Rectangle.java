package FactoryDesignPattern.Shapes_Example;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  protected double area() {
    return this.width * this.height;
  }

  @Override
  public void describe() {
    System.out.printf("This is a Rectangle with area: %.2f%n", area());
  }
}
