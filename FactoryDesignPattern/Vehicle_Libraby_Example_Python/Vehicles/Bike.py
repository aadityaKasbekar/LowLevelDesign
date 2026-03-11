from datetime import date
from Vehicles.Vehicle import Vehicle

class Bike(Vehicle):

  def __init__(self, manufacturer: str, makeYear: date, model: str, mileage: int, stateReg: str, colour: str, insured: bool, displacement: int):
    super().__init__(manufacturer, makeYear, model, mileage, stateReg, colour, insured)
    self.displacement = displacement
    self.__isStarted = False

  def describe(self):
    print(f"This is a {self.manufacturer}, {self.model} Bike, built in year {self.makeYear.year}. It's colour is {self.colour}. It has {self.displacement}cc engine displacement.")

  def turnOn(self) -> None:
    if self.__isStarted:
      print(f"Bike is already turned On.")
    else:
      print(f"Turning on the {self.manufacturer} {self.model}. Pushed the Start/Stop button")
      print(f"Bike Turned On")

  def turnOff(self) -> None:
    if self.__isStarted:
      print(f"Turning off the {self.manufacturer} {self.model}. Switched to Neutral Gear. Pushed the Start/Stop button")
      print(f"Bike Turned Off")
    else:
      print(f"Bike is already turned off.")

  def getregistrationInfo(self) -> str:
    return f"""Car Registration Information:->
                Registration State: {self.stateReg}
                Insurance Valid: {self.insured}
                Miles Driven: {self.mileage}
                Manufacturer: {self.manufacturer}
                Model: {self.model}
                Colour: {self.colour}
                Make Year: {self.makeYear.year}
                Engine Displacement: {self.displacement}cc
                """