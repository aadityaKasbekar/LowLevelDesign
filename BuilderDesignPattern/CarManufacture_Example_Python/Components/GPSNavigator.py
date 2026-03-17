class GPSNavigator:
	_route: str

	def __init__(self):
		self._route = "4290 Albany Drive, San Jose, CA, 95129"

	def getRoute(self) -> str:
		return self._route

	def setRoute(self, destinationAddress: str):
		self._route = destinationAddress

	def __repr__(self) -> str:
		return self.getRoute()

	def __str__(self) -> str:
		return f"Route: {self._route}"