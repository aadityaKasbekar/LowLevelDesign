package FactoryDesignPattern.Shapes_Example;

public class TriangleFactory extends ShapeFactory {
  @Override
  public Shape createShape() {
    return new Triangle(8, 3);
  }
}
