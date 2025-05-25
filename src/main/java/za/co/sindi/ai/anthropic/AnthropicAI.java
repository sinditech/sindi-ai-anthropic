/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import za.co.sindi.ai.anthropic.completions.CompletionPrompt;
import za.co.sindi.ai.anthropic.messages.CountMessage;
import za.co.sindi.ai.anthropic.messages.CountMessageTokens;
import za.co.sindi.ai.anthropic.messages.MessageInput;
import za.co.sindi.ai.anthropic.models.Completion;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.Model;
import za.co.sindi.ai.anthropic.models.ModelList;
import za.co.sindi.ai.anthropic.models.Prompt;
import za.co.sindi.ai.anthropic.models.TemplatePrompt;
import za.co.sindi.ai.anthropic.models.event.Event;
import za.co.sindi.ai.anthropic.prompts.ImprovePromptInput;
import za.co.sindi.ai.anthropic.prompts.PromptInput;
import za.co.sindi.ai.anthropic.prompts.TemplatePromptInput;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public interface AnthropicAI {

	public Message createMessage(final MessageInput input) throws IOException, InterruptedException;
	public CompletableFuture<Message> createMessageAsync(final MessageInput input);
	public Stream<Event> streamCreateMessage(final MessageInput input) throws IOException, InterruptedException;
	public CompletableFuture<Stream<Event>> streamCreateMessageAsync(final MessageInput input);
	public CountMessageTokens countMessageTokens(final CountMessage message) throws IOException, InterruptedException;
	public CompletableFuture<CountMessageTokens> countMessageTokensAsync(final CountMessage message);
	
	public Completion createTextCompletion(final CompletionPrompt prompt) throws IOException, InterruptedException;
	public CompletableFuture<Completion> createTextCompletionAsync(final CompletionPrompt prompt);
	public Stream<Event> streamCreateTextCompletion(final CompletionPrompt prompt) throws IOException, InterruptedException;
	public CompletableFuture<Stream<Event>> streamCreateTextCompletionAsync(final CompletionPrompt prompt);
	
	public Model getModel(final String modelId) throws IOException, InterruptedException;
	default ModelList getModelList() throws IOException, InterruptedException {
		return getModelList(null, null, null);
	}
	public ModelList getModelList(final String beforeId, final String afterId, final Integer limit) throws IOException, InterruptedException;
	public CompletableFuture<Model> getModelAsync(final String modelId);
	default CompletableFuture<ModelList> getModelListAsync() {
		return getModelListAsync(null, null, null);
	}
	public CompletableFuture<ModelList> getModelListAsync(final String beforeId, final String afterId, final Integer limit);
	
	public Prompt generateAPrompt(final PromptInput input) throws IOException, InterruptedException;
	public CompletableFuture<Prompt> generateAPromptAsync(final PromptInput input);
	public Prompt improvePrompt(final ImprovePromptInput input) throws IOException, InterruptedException;
	public CompletableFuture<Prompt> improvePromptAsync(final ImprovePromptInput input);
	public TemplatePrompt templatizeAPrompt(final TemplatePromptInput input) throws IOException, InterruptedException;
	public CompletableFuture<TemplatePrompt> templatizeAPromptAsync(final TemplatePromptInput input);
}
