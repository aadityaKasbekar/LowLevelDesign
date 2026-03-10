package FactoryDesignPattern.Shapes_Example;

public class RectangleFactory extends ShapeFactory {
  @Override
  public Shape createShape() {
    return new Rectangle(5, 4);
  }
}
