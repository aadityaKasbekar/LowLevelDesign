from Shapes_Factory.ShapeFactory import ShapeFactory
from Shapes.Rectangle import Rectangle

class RectangleFactory(ShapeFactory):

  def createShape(self):
    return Rectangle(4, 5)