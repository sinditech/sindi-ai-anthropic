/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import java.io.IOException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import za.co.sindi.ai.anthropic.APIClient;
import za.co.sindi.ai.anthropic.AnthropicAI;
import za.co.sindi.ai.anthropic.AnthropicAPIClient;
import za.co.sindi.ai.anthropic.completions.CompletionPrompt;
import za.co.sindi.ai.anthropic.completions.CreateCompletionRequest;
import za.co.sindi.ai.anthropic.messages.CountMessage;
import za.co.sindi.ai.anthropic.messages.CountMessageTokens;
import za.co.sindi.ai.anthropic.messages.CountMessageTokensRequest;
import za.co.sindi.ai.anthropic.messages.CreateMessageRequest;
import za.co.sindi.ai.anthropic.messages.MessageInput;
import za.co.sindi.ai.anthropic.models.Completion;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.Model;
import za.co.sindi.ai.anthropic.models.ModelList;
import za.co.sindi.ai.anthropic.models.event.Event;
import za.co.sindi.commons.net.URIBuilder;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ClaudeAI implements AnthropicAI {
	
	private static final String BASE_URL = "https://api.anthropic.com/v1";
	
	private APIClient apiClient;
	
	/**
	 * @param apiKey
	 */
	public ClaudeAI(final String apiKey) {
		this(new AnthropicAPIClient(apiKey));
	}
	
	/**
	 * @param apiKey
	 * @param anthropicVersion
	 */
	public ClaudeAI(final String apiKey, final String anthropicVersion) {
		this(new AnthropicAPIClient(apiKey, anthropicVersion));
	}
	
	/**
	 * @param apiClient
	 */
	public ClaudeAI(APIClient apiClient) {
		super();
		this.apiClient = Objects.requireNonNull(apiClient, "An Anthropic API Client is required.");
	}

	@Override
	public Message createMessage(MessageInput input) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CreateMessageRequest request = new CreateMessageRequest(BASE_URL + "/messages", input);
		return apiClient.send(request, Message.class);
	}

	@Override
	public CompletableFuture<Message> createMessageAsync(MessageInput input) {
		// TODO Auto-generated method stub
		CreateMessageRequest request = new CreateMessageRequest(BASE_URL + "/messages", input);
		return apiClient.sendAsync(request, Message.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#streamCreateMessage(za.co.sindi.ai.anthropic.models.MessageInput)
	 */
	@Override
	public Stream<Event> streamCreateMessage(MessageInput input) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		input.setStream(true);
		CreateMessageRequest request = new CreateMessageRequest(BASE_URL + "/messages", input);
		return apiClient.sendStreaming(request);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#streamCreateMessageAsync(za.co.sindi.ai.anthropic.models.MessageInput)
	 */
	@Override
	public CompletableFuture<Stream<Event>> streamCreateMessageAsync(MessageInput input) {
		// TODO Auto-generated method stub
		input.setStream(true);
		CreateMessageRequest request = new CreateMessageRequest(BASE_URL + "/messages", input);
		return apiClient.sendStreamingAsync(request);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#countMessageTokens(za.co.sindi.ai.anthropic.models.MessageInput)
	 */
	@Override
	public CountMessageTokens countMessageTokens(CountMessage message) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CountMessageTokensRequest request = new CountMessageTokensRequest(BASE_URL + "/messages/count_tokens", message);
		return apiClient.send(request, CountMessageTokens.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#countMessageTokensAsync(za.co.sindi.ai.anthropic.models.MessageInput)
	 */
	@Override
	public CompletableFuture<CountMessageTokens> countMessageTokensAsync(CountMessage message) {
		CountMessageTokensRequest request = new CountMessageTokensRequest(BASE_URL + "/messages/count_tokens", message);
		return apiClient.sendAsync(request, CountMessageTokens.class);
	}

	@Override
	public Completion createTextCompletion(CompletionPrompt prompt) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CreateCompletionRequest request = new CreateCompletionRequest(BASE_URL + "/complete", prompt);
		return apiClient.send(request, Completion.class);
	}

	@Override
	public CompletableFuture<Completion> createTextCompletionAsync(CompletionPrompt prompt) {
		// TODO Auto-generated method stub
		CreateCompletionRequest request = new CreateCompletionRequest(BASE_URL + "/complete", prompt);
		return apiClient.sendAsync(request, Completion.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#streamCreateTextCompletion(za.co.sindi.ai.anthropic.models.CompletionPrompt)
	 */
	@Override
	public Stream<Event> streamCreateTextCompletion(CompletionPrompt prompt) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		prompt.setStream(true);
		CreateCompletionRequest request = new CreateCompletionRequest(BASE_URL + "/complete", prompt);
		return apiClient.sendStreaming(request);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#streamCreateTextCompletionAsync(za.co.sindi.ai.anthropic.models.CompletionPrompt)
	 */
	@Override
	public CompletableFuture<Stream<Event>> streamCreateTextCompletionAsync(CompletionPrompt prompt) {
		// TODO Auto-generated method stub
		prompt.setStream(true);
		CreateCompletionRequest request = new CreateCompletionRequest(BASE_URL + "/complete", prompt);
		return apiClient.sendStreamingAsync(request);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#getModel(java.lang.String)
	 */
	@Override
	public Model getModel(String modelId) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return apiClient.get(URI.create(BASE_URL + "/" + modelId), Model.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#getModelList(java.lang.String, java.lang.String, java.lang.Integer)
	 */
	@Override
	public ModelList getModelList(String beforeId, String afterId, Integer limit) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		URIBuilder builder = new URIBuilder(URI.create(BASE_URL + "/models"));
		if (!Strings.isNullOrEmpty(beforeId)) {
			builder.addQueryParameters("before_id", beforeId);
		}
		if (!Strings.isNullOrEmpty(afterId)) {
			builder.addQueryParameters("after_id", afterId);
		}
		if (limit != null) {
			builder.addQueryParameters("limit", String.valueOf(limit));
		}
		return apiClient.get(builder.build(), ModelList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#getModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<Model> getModelAsync(String modelId) {
		// TODO Auto-generated method stub
		return apiClient.getAsync(URI.create(BASE_URL + "/" + modelId), Model.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.anthropic.AnthropicAI#getModelListAsync(java.lang.String, java.lang.String, java.lang.Integer)
	 */
	@Override
	public CompletableFuture<ModelList> getModelListAsync(String beforeId, String afterId, Integer limit) {
		// TODO Auto-generated method stub
		URIBuilder builder = new URIBuilder(URI.create(BASE_URL + "/models"));
		if (!Strings.isNullOrEmpty(beforeId)) {
			builder.addQueryParameters("before_id", beforeId);
		}
		if (!Strings.isNullOrEmpty(afterId)) {
			builder.addQueryParameters("after_id", afterId);
		}
		if (limit != null) {
			builder.addQueryParameters("limit", String.valueOf(limit));
		}
		return apiClient.getAsync(builder.build(), ModelList.class);
	}
}
