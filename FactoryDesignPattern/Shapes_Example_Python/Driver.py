from Client import Client
from Shapes.Shape import Shape
from Shapes_Factory.CrircleFactory import CircleFactory
from Shapes_Factory.RectangleFactory import RectangleFactory
from Shapes_Factory.TriangleFactory import TriangleFactory

class Driver():

  @staticmethod
  def main():
    client1: Client = Client(CircleFactory())
    client2: Client = Client(RectangleFactory())
    client3: Client = Client(TriangleFactory())

    shape1CreatedClient1: Shape = client1.getShape()
    shape2CreatedClient2: Shape = client2.getShape()
    shape3CreatedClient3: Shape = client3.getShape()

    shape1CreatedClient1.describe()
    shape2CreatedClient2.describe()
    shape3CreatedClient3.describe()

if __name__ == "__main__":
  Driver.main()