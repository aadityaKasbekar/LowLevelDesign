from datetime import date
from abc import ABC, abstractmethod

class Vehicle(ABC):

  def __init__(self, manufacturer: str, makeYear: date, model: str, mileage: int, stateReg: str, colour: str, insured: bool):
    self.manufacturer = manufacturer
    self.makeYear = makeYear
    self.model = model
    self.mileage = mileage
    self.stateReg = stateReg
    self.colour = colour
    self.insured = insured

  @abstractmethod
  def describe(self) -> None:
    pass

  @abstractmethod
  def turnOn(self) -> None:
    pass

  @abstractmethod
  def turnOff(self) -> None:
    pass

  @abstractmethod
  def getregistrationInfo(self) -> str:
    pass