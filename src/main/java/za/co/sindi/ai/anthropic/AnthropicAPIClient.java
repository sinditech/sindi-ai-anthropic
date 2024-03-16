/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import za.co.sindi.ai.anthropic.implementation.JSONObjectTransformerImpl;
import za.co.sindi.ai.anthropic.models.ErrorResponse;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class AnthropicAPIClient implements APIClient {
	
	private Duration connectionTimeout;
	private ProxySelector proxy;
	private Executor executor;
	private JSONObjectTransformer objectTransformer = new JSONObjectTransformerImpl();
	
	private final String apiKey;
	private final String anthropicVersion;
	
	/**
	 * @param apiKey
	 */
	public AnthropicAPIClient(final String apiKey) {
		this(apiKey, "2023-06-01");
	}
	
	/**
	 * @param apiKey
	 * @param anthropicVersion
	 */
	public AnthropicAPIClient(String apiKey, String anthropicVersion) {
		super();
		this.apiKey = Objects.requireNonNull(apiKey, "An Anthropic 'x-api-key' is required.");
		this.anthropicVersion = Objects.requireNonNull(anthropicVersion, "An Anthropic 'anthropic-version' is required.");;
	}

	@Override
	public void setConnectionTimeout(Duration connectionTimeout) {
		// TODO Auto-generated method stub
		this.connectionTimeout = connectionTimeout;
	}

	@Override
	public void setProxy(ProxySelector proxy) {
		// TODO Auto-generated method stub
		this.proxy = proxy;
	}

	@Override
	public void setExecutor(Executor executor) {
		// TODO Auto-generated method stub
		this.executor = executor;
	}

	@Override
	public void setObjectTransformer(JSONObjectTransformer objectTransformer) {
		// TODO Auto-generated method stub
		this.objectTransformer = objectTransformer;
	}

	@Override
	public <REQ, RES> RES send(APIRequest<REQ> apiRequest, Class<RES> responseType) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
		validateHttpResponse(httpResponse);
		return objectTransformer.transform(httpResponse.body(), responseType);
	}

	@Override
	public <REQ, RES> CompletableFuture<RES> sendAsync(APIRequest<REQ> apiRequest, final Class<RES> responseType) {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		CompletableFuture<HttpResponse<String>> httpResponseAsync = httpClient.sendAsync(httpRequest, BodyHandlers.ofString());
		return httpResponseAsync.thenApplyAsync(httpResponse -> {
			validateHttpResponse(httpResponse);
			return objectTransformer.transform(httpResponse.body(), responseType);
		}).toCompletableFuture();
	}
	
	private <REQ> HttpRequest.Builder createHttpRequestBuilder(final APIRequest<REQ> request) {
		return HttpRequest.newBuilder(URI.create(request.getUri()))
						  .header("Content-Type", "application/json")
						  .header("Accept", "application/json")
						  .header("x-api-key", apiKey)
						  .header("anthropic-version", anthropicVersion)
						  .POST(BodyPublishers.ofString(objectTransformer.transform(request.getRequestBody()), StandardCharsets.UTF_8));
	}
	
	private HttpClient createHttpClient() {
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		if (connectionTimeout != null) {
			httpClientBuilder.connectTimeout(connectionTimeout);
		}
		
		if (proxy != null) {
			httpClientBuilder.proxy(proxy);
		}
		
		if (executor != null) {
			httpClientBuilder.executor(executor);
		}
		
		return httpClientBuilder.build();
	}
	
	private void validateHttpResponse(final HttpResponse<String> httpResponse) {
		int code = httpResponse.statusCode() / 100;
		if (code == 4 || code == 5) {
			ErrorResponse httpError = objectTransformer.transform(httpResponse.body(), ErrorResponse.class);
			throw new AnthropicAIException(httpError.getError());
		}
	}
}
