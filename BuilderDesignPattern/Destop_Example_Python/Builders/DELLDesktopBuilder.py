from BuilderDesignPattern.Destop_Example_Python.Builders.DesktopBuilder import DesktopBuilder


class DELLDesktopBuilder(DesktopBuilder):

	def buildMonitor(self) -> None:
		self._desktop.setMonitor("DELL Monitor")

	def buildKeyboard(self) -> None:
		self._desktop.setKeyboard("DELL Keyboard")

	def buildMouse(self) -> None:
		self._desktop.setMouse("DELL Mouse")

	def buildSpeakers(self) -> None:
		self._desktop.setSpeakers("DELL Speakers")

	def buildRam(self) -> None:
		self._desktop.setRam("DELL Ram")

	def buildProcessor(self) -> None:
		self._desktop.setProcessor("DELL Processor")

	def buildMotherboard(self) -> None:
		self._desktop.setMotherboard("DELL Motherboard")