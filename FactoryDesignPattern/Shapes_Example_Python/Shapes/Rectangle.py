from Shapes.Shape import Shape

class Rectangle(Shape):

  def __init__(self, height: float, width: float):
    self.height = height
    self.width = width

  def area(self) -> float:
    return self.height * self.width

  def describe(self) -> None:
    print(f"This is a Rectangle with Height: {self.height}, and Width:{self.width} with Area:{self.area()}")