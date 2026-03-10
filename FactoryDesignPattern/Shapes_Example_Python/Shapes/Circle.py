import math
from Shapes.Shape import Shape

class Circle(Shape):

  def __init__(self, radius: float):
    self.radius = radius

  def area(self) -> float:
    return math.pi * self.radius * self.radius
  
  def describe(self) -> None:
    print(f"This is Circle with Radius: {self.radius} with Area: {self.area()}.")