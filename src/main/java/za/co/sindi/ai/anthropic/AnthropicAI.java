/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import za.co.sindi.ai.anthropic.models.Completion;
import za.co.sindi.ai.anthropic.models.CompletionPrompt;
import za.co.sindi.ai.anthropic.models.CountMessage;
import za.co.sindi.ai.anthropic.models.CountMessageTokens;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.MessageInput;
import za.co.sindi.ai.anthropic.models.event.Event;

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
	public CompletableFuture<Stream<Event> > streamCreateTextCompletionAsync(final CompletionPrompt prompt);
}
