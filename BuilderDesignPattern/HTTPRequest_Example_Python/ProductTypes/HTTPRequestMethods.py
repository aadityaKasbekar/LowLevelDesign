from enum import Enum, auto

class HTTPRequestMethods(Enum):
	GET = auto()
	POST = auto()
	PUT = auto()
	DELETE = auto()
	PATCH = auto()