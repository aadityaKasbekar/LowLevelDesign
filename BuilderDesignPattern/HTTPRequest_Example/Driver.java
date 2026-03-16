package BuilderDesignPattern.HTTPRequest_Example;

import BuilderDesignPattern.HTTPRequest_Example.Directors.HttpRequestDirector;
import BuilderDesignPattern.HTTPRequest_Example.ProductTypes.HttpMethodType;
import BuilderDesignPattern.HTTPRequest_Example.Products.HttpRequest;

public class Driver {

	public static void main(String[] agrs) {

		HttpRequest getRequest1 = new HttpRequest.Builder("https://aadityakasbekar.com").build();

		HttpRequest postRequest1 = new HttpRequest.Builder("\"https://aadityakasbekar.com\"")
										  .setMethod(HttpMethodType.POST)
										  .addHeaders("Content-Type", "application/json")
										  .addBody("{\"name\":\"Alice\",\"email\":\"alice@example.com\"}")
										  .setTimeout(4000)
										  .build();

		HttpRequest putRequest1 = new HttpRequest.Builder("https://aadityakasbekar.com")
										 .setMethod(HttpMethodType.PUT)
										 .addHeaders("Authorization", "Bearer token123")
										 .addHeaders("Content-Type", "application/json")
										 .addQueryParameters("env", "production")
										 .addQueryParameters("version", "2")
										 .addBody("{\"feature_flag\":true}")
										 .setTimeout(10000)
										 .build();

		System.out.println(getRequest1);
		System.out.println(postRequest1);
		System.out.println(putRequest1);

		HttpRequestDirector director = new HttpRequestDirector();

		HttpRequest getRequest2 = director.buildSimpleGetRequest("https://api.example.com/users");
		HttpRequest postRequest2 = director.buildAuthenticatedPost(
				"https://api.example.com/orders", "token123", "{\"item\":\"book\"}");

		System.out.println(getRequest2);
		System.out.println(postRequest2);
		System.out.println(getRequest2);
	}

}
