from abc import ABC, abstractmethod

class Shape(ABC):

  @abstractmethod
  def area(self) -> float:
    pass

  @abstractmethod
  def describe(self) -> None:
    pass