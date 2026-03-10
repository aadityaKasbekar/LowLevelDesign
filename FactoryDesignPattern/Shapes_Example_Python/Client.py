from Shapes_Factory.ShapeFactory import ShapeFactory
from Shapes.Shape import Shape

class Client:

  def __init__(self, shapeFactory: ShapeFactory):
    self.createdShape = shapeFactory.createShape()

  def getShape(self) -> Shape:
    return self.createdShape