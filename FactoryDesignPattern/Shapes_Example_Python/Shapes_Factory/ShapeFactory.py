from abc import ABC, abstractmethod
from Shapes.Shape import Shape

class ShapeFactory(ABC):

  @abstractmethod
  def createShape(self) -> Shape:
    pass

  def describe(self) -> None:
    shape: Shape = self.createShape()
    shape.describe()