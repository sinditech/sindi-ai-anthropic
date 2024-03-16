/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.anthropic.models.Completion;
import za.co.sindi.ai.anthropic.models.CompletionPrompt;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.MessageInput;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public interface AnthropicAI {

	public Message createMessage(final MessageInput input) throws IOException, InterruptedException;
	public CompletableFuture<Message> createMessageAsync(final MessageInput input);
	
	public Completion createTextCompletion(final CompletionPrompt prompt) throws IOException, InterruptedException;
	public CompletableFuture<Completion> createTextCompletionAsync(final CompletionPrompt prompt);
}
