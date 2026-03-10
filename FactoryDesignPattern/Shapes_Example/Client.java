package FactoryDesignPattern.Shapes_Example;

public class Client {
  private Shape createdShape;

  public Client(ShapeFactory factory) {
    this.createdShape = factory.createShape();
  }

  public Shape getShape() {
    return this.createdShape;
  }
}
