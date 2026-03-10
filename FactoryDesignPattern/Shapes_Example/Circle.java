package FactoryDesignPattern.Shapes_Example;

public class Circle extends Shape {
  private double circleRadius;

  public Circle(double radius) {
    this.circleRadius = radius;
  }

  @Override
  protected double area() {
    return Math.PI * this.circleRadius * this.circleRadius;
  }

  @Override
  public void describe() {
    System.out.printf("This is a Circle with area: %.2f%n", area());
  }
}
