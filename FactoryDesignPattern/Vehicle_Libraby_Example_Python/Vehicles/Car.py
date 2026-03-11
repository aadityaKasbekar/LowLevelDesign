from datetime import date
from Vehicles.Vehicle import Vehicle

class Car(Vehicle):

  def __init__(self, manufacturer: str, makeYear: date, model: str, mileage: int, stateReg: str, colour: str, insured: bool, transmission: str, powerTrain: str):
    super().__init__(manufacturer, makeYear, model, mileage, stateReg, colour, insured)
    self.transmission = transmission
    self.powerTrain = powerTrain
    self.__isStarted = False

  def describe(self):
    print(f"This is a {self.manufacturer}, {self.model} car, built in year {self.makeYear.year}. It's colour is {self.colour}. It has {self.transmission} tranmission.")

  def turnOn(self) -> None:
    if self.__isStarted:
      print(f"Car is already turned On.")
    else:
      print(f"Turning on the {self.manufacturer} {self.model}. Pushed the Start/Stop button")
      print(f"Car Turned On")

  def turnOff(self) -> None:
    if self.__isStarted:
      print(f"Turning off the {self.manufacturer} {self.model}. Parking Brakes applied. Pushed the Start/Stop button")
      print(f"Car Turned Off")
    else:
      print(f"Car is already turned off.")

  def getregistrationInfo(self) -> str:
    return f"""Car Registration Information:->
                Registration State: {self.stateReg}
                Insurance Valid: {self.insured}
                Miles Driven: {self.mileage}
                Manufacturer: {self.manufacturer}
                Model: {self.model}
                Colour: {self.colour}
                Make Year: {self.makeYear.year}
                Power Train Type: {self.powerTrain}
                Transmission Type: {self.transmission}
                """