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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.anthropic.implementation.JSONObjectTransformerImpl;
import za.co.sindi.ai.anthropic.models.ErrorResponse;
import za.co.sindi.commons.net.http.WithErrorBodyHandler;
import za.co.sindi.commons.net.sse.AllEventsEventHandler;
import za.co.sindi.commons.net.sse.Event;
import za.co.sindi.commons.net.sse.MessageEvent;
import za.co.sindi.commons.net.sse.SSEEventSubscriber;
import za.co.sindi.commons.util.Either;

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
	private final String[] anthropicBeta;
	
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
		this(apiKey, anthropicVersion, (String[])null);
	}

	/**
	 * @param apiKey
	 * @param anthropicVersion
	 * @param anthropicBeta
	 */
	public AnthropicAPIClient(String apiKey, String anthropicVersion, String... anthropicBeta) {
		super();
		this.apiKey = Objects.requireNonNull(apiKey, "An Anthropic 'x-api-key' is required.");
		this.anthropicVersion = Objects.requireNonNull(anthropicVersion, "An Anthropic 'anthropic-version' is required.");
		this.anthropicBeta = anthropicBeta;
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.APIClient#get(java.net.URI, java.lang.Class)
	 */
	@Override
	public <REQ, RES> RES get(URI uri, Class<RES> responseType) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createGETHttpRequestBuilder(uri).build();
		HttpClient httpClient = createHttpClient();
		HttpResponse<Either<String, String>> httpResponse = httpClient.send(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.ofString()));
		validateHttpResponse(httpResponse);
		return objectTransformer.transform(httpResponse.body().getLeft(), responseType);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.APIClient#getAsync(java.net.URI, java.lang.Class)
	 */
	@Override
	public <REQ, RES> CompletableFuture<RES> getAsync(URI uri, Class<RES> responseType) {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createGETHttpRequestBuilder(uri).build();
		HttpClient httpClient = createHttpClient();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseAsync = httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.ofString()));
		return httpResponseAsync.thenApplyAsync(httpResponse -> {
			validateHttpResponse(httpResponse);
			return objectTransformer.transform(httpResponse.body().getLeft(), responseType);
		});
	}

	@Override
	public <REQ, RES> RES send(APIRequest<REQ> apiRequest, Class<RES> responseType) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createPOSTHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		HttpResponse<Either<String, String>> httpResponse = httpClient.send(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.ofString()));
		validateHttpResponse(httpResponse);
		return objectTransformer.transform(httpResponse.body().getLeft(), responseType);
	}

	@Override
	public <REQ, RES> CompletableFuture<RES> sendAsync(APIRequest<REQ> apiRequest, final Class<RES> responseType) {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createPOSTHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseAsync = httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.ofString()));
		return httpResponseAsync.thenApplyAsync(httpResponse -> {
			validateHttpResponse(httpResponse);
			return objectTransformer.transform(httpResponse.body().getLeft(), responseType);
		});
	}
	
	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.APIClient#sendStreaming(za.co.sindi.ai.anthropic.APIRequest)
	 */
	@Override
	public <REQ> Stream<za.co.sindi.ai.anthropic.models.event.Event> sendStreaming(APIRequest<REQ> apiRequest) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		AllEventsEventHandler sseEventHandler = new AllEventsEventHandler();
		SSEEventSubscriber sseEventSubscriber = new SSEEventSubscriber(sseEventHandler);
		HttpRequest httpRequest = createPOSTHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		HttpResponse<Either<Void, String>> httpResponse = httpClient.send(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.fromLineSubscriber(sseEventSubscriber)));
		validateHttpResponse(httpResponse);
		return handleStream(sseEventHandler.getEventStream());
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.APIClient#sendStreamingAsync(za.co.sindi.ai.anthropic.APIRequest)
	 */
	@Override
	public <REQ> CompletableFuture<Stream<za.co.sindi.ai.anthropic.models.event.Event>> sendStreamingAsync(APIRequest<REQ> apiRequest) {
		// TODO Auto-generated method stub
		AllEventsEventHandler sseEventHandler = new AllEventsEventHandler();
		SSEEventSubscriber sseEventSubscriber = new SSEEventSubscriber(sseEventHandler);
		HttpRequest httpRequest = createPOSTHttpRequestBuilder(apiRequest).build();
		HttpClient httpClient = createHttpClient();
		CompletableFuture<HttpResponse<Either<Void, String>>> httpResponseAsync = httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<>(BodyHandlers.fromLineSubscriber(sseEventSubscriber)));
		return httpResponseAsync.thenApplyAsync(httpResponse -> {
			validateHttpResponse(httpResponse);
			return handleStream(sseEventHandler.getEventStream());
		});
	}
	
	private HttpRequest.Builder createGETHttpRequestBuilder(final URI uri) {
		return createHttpRequestBuilder(uri).GET();
	}

	private <REQ> HttpRequest.Builder createPOSTHttpRequestBuilder(final APIRequest<REQ> request) {
		return createHttpRequestBuilder(URI.create(request.getUri()))
						  .POST(BodyPublishers.ofString(objectTransformer.transform(request.getRequestBody()), StandardCharsets.UTF_8));
	}
	
	private HttpRequest.Builder createHttpRequestBuilder(final URI uri) {
		HttpRequest.Builder builder = HttpRequest.newBuilder(uri)
				  .header("Content-Type", "application/json")
//				  .header("Accept", "application/json")
				  .header("x-api-key", apiKey)
				  .header("anthropic-version", anthropicVersion);
		if (anthropicBeta != null) {
			builder.header("anthropic-beta", String.join(",", anthropicBeta));
		}
		
		return builder;
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
	
	private <R> void validateHttpResponse(final HttpResponse<Either<R, String>> httpResponse) {
		Either<R, String> either = httpResponse.body();
		if (either.isRightPresent()) {
			ErrorResponse httpError = objectTransformer.transform(either.getRight(), ErrorResponse.class);
			throw new AnthropicAIException(httpError.getError());
		}
	}
	
	protected Stream<za.co.sindi.ai.anthropic.models.event.Event> handleStream(final Stream<Event> events) {
		List<za.co.sindi.ai.anthropic.models.event.Event> result = new ArrayList<>();
		events.forEach(event -> {
			if (event instanceof MessageEvent message) {
				String content = message.getData();
				if (!"[DONE]".equals(content)) {
					result.add(objectTransformer.transform(content, za.co.sindi.ai.anthropic.models.event.Event.class));
				}
			}
		});
		
		return Collections.unmodifiableList(result).stream();
	}
}
