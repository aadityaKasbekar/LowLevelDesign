from datetime import date
from Vehicles.Vehicle import Vehicle

class Truck(Vehicle):

  def __init__(self, manufacturer: str, makeYear: date, model: str, mileage: int, stateReg: str, colour: str, insured: bool, towingCapacity: int):
    super().__init__(manufacturer, makeYear, model, mileage, stateReg, colour, insured)
    self.towingCapacity = towingCapacity
    self.__isStarted: bool = False

  def describe(self):
    print(f"This is a {self.manufacturer}, {self.model} semi truck, built in year {self.makeYear.year}. It's colour is {self.colour}. It has {self.towingCapacity} tons of towing capacity.")

  def turnOn(self) -> None:
    if self.__isStarted:
      print(f"Truck is already turned On.")
    else:
      print(f"Turning on the {self.manufacturer} {self.model}. Pushed the Start/Stop button")
      print(f"Truck Turned On")

  def turnOff(self) -> None:
    if self.__isStarted:
      print(f"""Turning off the {self.manufacturer} {self.model}.
            Parking Brakes. 
            Applied Trailer Brakes applied.
            Pushed the Start/Stop button""")
      print(f"Truck Turned Off")
    else:
      print(f"Truck is already turned off.")

  def getregistrationInfo(self) -> str:
    return f"""Truck Registration Information:->
                Registration State: {self.stateReg}
                Insurance Valid: {self.insured}
                Miles Driven: {self.mileage}
                Manufacturer: {self.manufacturer}
                Model: {self.model}
                Colour: {self.colour}
                Make Year: {self.makeYear.year}
                Towing Capacity: {self.towingCapacity} tons
                """