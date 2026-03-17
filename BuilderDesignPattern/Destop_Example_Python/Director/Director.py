from BuilderDesignPattern.Destop_Example_Python.Builders.DesktopBuilder import DesktopBuilder
from BuilderDesignPattern.Destop_Example_Python.Products.Desktop import Desktop


class Director():

	_desktopBuilder: DesktopBuilder

	def __init__(self, desktopBuilder: DesktopBuilder) -> None:
		super().__init__()
		self._desktopBuilder = desktopBuilder

	def getDesktop(self) -> Desktop:
		return self._desktopBuilder.getDesktop()

	def buildDesktop(self) -> Desktop:
		self._desktopBuilder.buildMonitor()
		self._desktopBuilder.buildKeyboard()
		self._desktopBuilder.buildMouse()
		self._desktopBuilder.buildSpeakers()
		self._desktopBuilder.buildRam()
		self._desktopBuilder.buildProcessor()
		self._desktopBuilder.buildMotherboard()
		return self._desktopBuilder.getDesktop()
