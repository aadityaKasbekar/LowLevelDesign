package FactoryDesignPattern.Shapes_Example;

abstract class ShapeFactory {
  public abstract Shape createShape();

  public void describe() {
    Shape shape = createShape();
    shape.describe();
  }
}
