package BuilderDesignPattern.HTTPRequest_Example.Directors;

import BuilderDesignPattern.HTTPRequest_Example.ProductTypes.HttpMethodType;
import BuilderDesignPattern.HTTPRequest_Example.Products.HttpRequest;

public class HttpRequestDirector {

	public HttpRequest buildSimpleGetRequest (String url) {
		return new HttpRequest.Builder(url)
					   .setMethod(HttpMethodType.GET)
					   .setTimeout(3000)
					   .build();
	}

	public HttpRequest buildSimplePostRequest (String url, String body) {
		return new HttpRequest.Builder(url)
					   .setMethod(HttpMethodType.POST)
					   .addBody(body)
					   .setTimeout(3000)
					   .build();
	}

	public HttpRequest buildSimplePutRequest (String url) {
		return new HttpRequest.Builder(url)
					   .setMethod(HttpMethodType.PUT)
					   .setTimeout(3000)
					   .build();
	}

	public HttpRequest buildSimpleDeleteRequest (String url, String key, String value) {
		return new HttpRequest.Builder(url)
					   .setMethod(HttpMethodType.DELETE)
					   .addQueryParameters(key, value)
					   .setTimeout(3000)
					   .build();
	}

	public HttpRequest buildAuthenticatedPost(String url, String token, String body) {
		return new HttpRequest.Builder(url)
					   .setMethod(HttpMethodType.POST)
					   .addHeaders("Authorization", "Bearer " + token)
					   .addHeaders("Content-Type", "application/json")
					   .addBody(body)
					   .setTimeout(10000)
					   .build();
	}
}
