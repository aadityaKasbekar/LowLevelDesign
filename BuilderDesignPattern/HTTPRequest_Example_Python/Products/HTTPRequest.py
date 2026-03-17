from typing import Final

from BuilderDesignPattern.HTTPRequest_Example_Python.ProductTypes.HTTPRequestMethods import HTTPRequestMethods


class HTTPRequest:

	def __init__(self, url: str, methodType: HTTPRequestMethods, headers: dict[str, str], queryParameters: dict[str, str], body: str, timeOut: int):
		self.__url: Final [str] = url
		self.__methodType: Final[HTTPRequestMethods] = methodType
		self.__headers: Final[dict[str, str]] = headers
		self.__queryParameters: Final[dict[str, str]] = queryParameters
		self.__body: Final [str] = body
		self.__timeOut: Final[int] = timeOut

	# --- Getters ---
	@property
	def url(self) -> str:
		return self.__url

	@property
	def method_type(self) -> HTTPRequestMethods:
		return self.__methodType

	@property
	def headers(self) -> dict[ str, str ]:
		return self.__headers

	@property
	def query_parameters(self) -> dict[ str, str ]:
		return self.__queryParameters

	@property
	def body(self) -> str:
		return self.__body

	@property
	def timeout(self) -> int:
		return self.__timeOut

	def __str__(self) -> str:
		# 1. Construct the Full URL with Query Parameters
		url_path = self.__url
		if self.__queryParameters:
			query_string = "&".join([ f"{k}={v}" for k, v in self.__queryParameters.items() ])
			connector = "&" if "?" in url_path else "?"
			url_path += f"{connector}{query_string}"

		# 2. Start the output with the Request Line (Method + Path)
		# Using .value assuming HTTPRequestMethods.GET.value is "GET"
		lines = [ f"{self.__methodType.name} {url_path}" ]

		# 3. Add Headers (Standard HTTP style is Key: Value)
		if self.__headers:
			for key, value in self.__headers.items():
				lines.append(f"  {key}: {value}")
		else:
			lines.append("  Headers: None")

		# 4. Add Body
		# We display the body only if it's not empty/None
		if self.__body:
			# Truncate body if it's massive to keep logs clean, or show as is:
			display_body = (self.__body[ :100 ] + '...') if len(self.__body) > 103 else self.__body
			lines.append(f"  Content: {display_body}")

		# 5. Add Metadata (Timeout)
		lines.append(f"  Timeout: {self.__timeOut}s")

		# Join with ' \' and newline for that readable terminal/curl look
		return " \\\n".join(lines)
