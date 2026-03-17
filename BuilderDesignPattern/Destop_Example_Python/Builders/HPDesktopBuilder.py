from BuilderDesignPattern.Destop_Example_Python.Builders.DesktopBuilder import DesktopBuilder


class HPDesktopBuilder(DesktopBuilder):

	def buildMonitor(self) -> None:
		self._desktop.setMonitor("HP Monitor")

	def buildKeyboard(self) -> None:
		self._desktop.setKeyboard("HP Keyboard")

	def buildMouse(self) -> None:
		self._desktop.setMouse("HP Mouse")

	def buildSpeakers(self) -> None:
		self._desktop.setSpeakers("HP Speakers")

	def buildRam(self) -> None:
		self._desktop.setRam("HP Ram")

	def buildProcessor(self) -> None:
		self._desktop.setProcessor("HP Processor")

	def buildMotherboard(self) -> None:
		self._desktop.setMotherboard("HP Motherboard")