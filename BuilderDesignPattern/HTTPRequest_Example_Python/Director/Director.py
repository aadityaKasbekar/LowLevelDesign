from BuilderDesignPattern.HTTPRequest_Example_Python.Builder.HTTPRequestBuilder import HTTPRequestBuilder
from BuilderDesignPattern.HTTPRequest_Example_Python.ProductTypes.HTTPRequestMethods import HTTPRequestMethods
from BuilderDesignPattern.HTTPRequest_Example_Python.Products.HTTPRequest import HTTPRequest


class Director:

	def simpleGetRequest(self, url: str) -> HTTPRequest:
		return HTTPRequestBuilder(url, HTTPRequestMethods.GET).build()
