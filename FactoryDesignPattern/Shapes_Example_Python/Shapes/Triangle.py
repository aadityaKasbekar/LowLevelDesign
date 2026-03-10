from Shapes.Shape import Shape

class Triangle(Shape):

  def __init__(self, height: float, base: float):
    self.height = height
    self.base = base

  def area(self) -> float:
    return 0.5 * self.base * self.height

  def describe(self) -> None:
    print(f"This is a Triangle with Height: {self.height}, and Base: {self.base} with Area: {self.area()}")