package FactoryDesignPattern.Shapes_Example;

public class Driver {
  public static void main(String[] args) {
    ShapeFactory circleFactory = new CircleFactory();
    ShapeFactory rectangleFactory = new RectangleFactory();
    ShapeFactory triangleFactory = new TriangleFactory();

    Client user1 = new Client(circleFactory);
    Client user2 = new Client(rectangleFactory);
    Client user3 = new Client(triangleFactory);

    Shape createdShapebyUser1 = user1.getShape();
    Shape createdShapebyUser2 = user2.getShape();
    Shape createdShapebyUser3 = user3.getShape();

    createdShapebyUser1.describe();
    createdShapebyUser2.describe();
    createdShapebyUser3.describe();
  }
}
