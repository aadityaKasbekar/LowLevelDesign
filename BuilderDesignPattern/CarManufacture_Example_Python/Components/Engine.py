from typing import Final

class Engine:

	def __init__(self, engineVolume, engineMileage):
		self._volume: Final[int] = engineVolume
		self._mileage: int = engineMileage
		self._started: bool = False

	def isStarted(self):
		if self._started:
			return True
		else:
			return False

	def turnOn(self):
		if self.isStarted():
			print(f"The Car is already on.")
		else:
			self._started = True
			print(f"The Car is Turned On")

	def turnOff(self):
		if self.isStarted():
			self._started = False
			print(f"The Car is turned Off")
		else:
			print(f"The Car is already off")

	def go(self, miles: int):
		if self.isStarted():
			self._mileage += miles
		else:
			print(f"Start the car First")

	def getVolume(self):
		return self._volume

	def getMileage(self):
		return self._mileage