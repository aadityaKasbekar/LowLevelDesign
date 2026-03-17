from typing import Final

class Engine:

	_volume: Final[int]
	_mileage: int
	_started: bool

	def __init__(self, engineVolume, engineMileage):
		self._volume = engineVolume
		self._mileage = engineMileage
		self._started = False

	def _isStarted(self):
		if self._started:
			return True
		else:
			return False

	def turnOn(self):
		if self._isStarted():
			print(f"The Car is already on.")
		else:
			self._started = True
			print(f"The Car is Turned On")

	def turnOff(self):
		if self._isStarted():
			self._started = False
			print(f"The Car is turned Off")
		else:
			print(f"The Car is already off")

	def go(self, miles: int):
		if self._isStarted():
			self._mileage += miles
		else:
			print(f"Start the car First")

	def getVolume(self):
		return self._volume

	def getMileage(self):
		return self._mileage