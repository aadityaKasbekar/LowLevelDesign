from typing import Final

from BuilderDesignPattern.HTTPRequest_Example_Python.ProductTypes.HTTPRequestMethods import HTTPRequestMethods
from BuilderDesignPattern.HTTPRequest_Example_Python.Products.HTTPRequest import HTTPRequest


class HTTPRequestBuilder:

	def __init__(self, url: str, reqMethodType: HTTPRequestMethods):
		self.__url: Final[str] = url
		self.__methodType: Final[HTTPRequestMethods] = reqMethodType
		self.__headers: dict[str, str] = {}
		self.__queryParameters: dict[ str, str ] = {}
		self.__body: str = ""
		self.__timeOut: int = 0

	def addRequestHeaders(self, key: str, value: str) -> "HTTPRequestBuilder":
		self.__headers[ key ] = value
		return self

	def addRequestQueryParameters(self, key: str, value: str) -> "HTTPRequestBuilder":
		self.__queryParameters[ key ] = value
		return self

	def addRequestBody(self, body: str) -> "HTTPRequestBuilder":
		self.__body = body
		return self

	def setRequestTimeOut(self, timeOut: int) -> "HTTPRequestBuilder":
		self.__timeOut = timeOut
		return self

	def build(self) -> HTTPRequest:
		return HTTPRequest(self.__url, self.__methodType, self.__headers, self.__queryParameters, self.__body, self.__timeOut)