package BuilderDesignPattern.HTTPRequest_Example.Products;

import BuilderDesignPattern.HTTPRequest_Example.ProductTypes.HttpMethodType;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

	private final String         url;
	private final HttpMethodType method;
	private final Map<String, String> headers;
	private final Map<String, String> queryParameters;
	private final String body;
	private final int timeout;

	private HttpRequest(Builder builder) {
		this.url = builder.url;
		this.method = builder.method;
		this.headers = builder.headers;
		this.queryParameters = builder.queryParameters;
		this.body = builder.body;
		this.timeout = builder.timeout;
	}

	public String getUrl() {
		return url;
	}

	public HttpMethodType getMethod() {
		return method;
	}

	public Map<String, String> getHeader() {
		return headers;
	}

	public Map<String, String> getQueryParameters() {
		return queryParameters;
	}

	public String getBody() {
		return body;
	}

	public int getTimeout() {
		return timeout;
	}

	public static class Builder {

		private final String url;
		private HttpMethodType method = HttpMethodType.GET;
		private Map<String, String> headers = new HashMap<>();
		private Map<String, String> queryParameters = new HashMap<>();
		private String body;
		private int timeout = 30000;

		public Builder(String url) {
			this.url = url;
		}

		public Builder setMethod(HttpMethodType method) {
			this.method = method;
			return this;
		}

		public Builder addHeaders(String key, String value) {
			this.headers.put(key, value);
			return this;
		}

		public Builder addQueryParameters(String key, String value) {
			this.queryParameters.put(key, value);
			return this;
		}

		public Builder addBody(String body) {
			this.body = body;
			return this;
		}

		public Builder setTimeout(int timeout) {
			this.timeout = timeout;
			return this;
		}

		public HttpRequest build() {
			return new HttpRequest(this);
		}
	}

	@Override
	public String toString() {
		return "HttpRequest{url='" + url + "', method='" + method +
					   "', headers=" + headers + ", queryParams=" + queryParameters +
					   ", body='" + body + "', timeout=" + timeout + "}";
	}
}
