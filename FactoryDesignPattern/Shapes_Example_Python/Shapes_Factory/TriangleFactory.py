from Shapes_Factory.ShapeFactory import ShapeFactory
from Shapes.Triangle import Triangle

class TriangleFactory(ShapeFactory):

  def createShape(self):
    return Triangle(5, 3)