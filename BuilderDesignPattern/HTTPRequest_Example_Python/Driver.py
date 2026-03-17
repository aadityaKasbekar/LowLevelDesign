from BuilderDesignPattern.HTTPRequest_Example_Python.Builder.HTTPRequestBuilder import HTTPRequestBuilder
from BuilderDesignPattern.HTTPRequest_Example_Python.Director.Director import Director
from BuilderDesignPattern.HTTPRequest_Example_Python.ProductTypes.HTTPRequestMethods import HTTPRequestMethods
from BuilderDesignPattern.HTTPRequest_Example_Python.Products.HTTPRequest import HTTPRequest


class Driver:

	@staticmethod
	def main():
		director: Director = Director()
		reqBuilder1: HTTPRequestBuilder = HTTPRequestBuilder("https://rivian.com",  HTTPRequestMethods.GET)

		req1: HTTPRequest = director.simpleGetRequest("https://aadityakasbekar.com")

		req2: HTTPRequest = (reqBuilder1.addRequestHeaders("Content-Type", "application/json")
							 .addRequestHeaders("Authorization", "Bearer token123")
							 .addRequestQueryParameters("env", "production")
							 .addRequestQueryParameters("nve", "production")
							 .addRequestBody("{\"feature_flag\":true}")
							 .setRequestTimeOut(1000)
							 .build())

		print(req1)
		print(req2)


if __name__ == '__main__':
	Driver.main()
