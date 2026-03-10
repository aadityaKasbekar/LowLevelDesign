package FactoryDesignPattern.Shapes_Example;

public class CircleFactory extends ShapeFactory {

  @Override
  public Shape createShape() {
    return new Circle(5);
  }
}
