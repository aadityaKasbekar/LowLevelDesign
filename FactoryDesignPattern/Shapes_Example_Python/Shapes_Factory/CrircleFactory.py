from Shapes_Factory.ShapeFactory import ShapeFactory
from Shapes.Circle import Circle

class CircleFactory(ShapeFactory):

  def createShape(self):
    return Circle(5)