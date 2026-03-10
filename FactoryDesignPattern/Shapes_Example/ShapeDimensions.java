package FactoryDesignPattern.Shapes_Example;

public class ShapeDimensions {
  private double circleRadius;
  private double width;
  private double height;
  private double base;

  public ShapeDimensions(double r, double w, double h, double b) {
    this.circleRadius = r;
    this.width = w;
    this.height = h;
    this.base = b;
  }

  public double getShapeRadius() {
    return this.circleRadius;
  }

  public double getShapeHeight() {
    return this.height;
  }

  public double getShapeWidth() {
    return this.width;
  }

  public double getShapeBase() {
    return this.base;
  }
}
