/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.anthropic.APIClient;
import za.co.sindi.ai.anthropic.AnthropicAI;
import za.co.sindi.ai.anthropic.AnthropicAPIClient;
import za.co.sindi.ai.anthropic.completions.CreateCompletionRequest;
import za.co.sindi.ai.anthropic.messages.CreateMessageRequest;
import za.co.sindi.ai.anthropic.models.Completion;
import za.co.sindi.ai.anthropic.models.CompletionPrompt;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.MessageInput;

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
}
