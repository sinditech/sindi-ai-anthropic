/**
 * 
 */
package za.co.sindi.ai.anthropic.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import za.co.sindi.ai.anthropic.AnthropicAI;
import za.co.sindi.ai.anthropic.implementation.Claude3AI;
import za.co.sindi.ai.anthropic.models.ClaudeModelNames;
import za.co.sindi.ai.anthropic.models.InputMessage;
import za.co.sindi.ai.anthropic.models.InputStringMessage;
import za.co.sindi.ai.anthropic.models.Message;
import za.co.sindi.ai.anthropic.models.MessageInput;
import za.co.sindi.ai.anthropic.models.TextContent;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class Claude3AITest {

	public static void main(String[] args) throws IOException, InterruptedException {
		testClaude3Message();
	}
	
	private static void testClaude3Message() throws IOException, InterruptedException {
		AnthropicAI ai = new Claude3AI("asdfsdfsdfasdfasdf");
		List<InputMessage<?>> messages = new ArrayList<>();
		messages.add(new InputStringMessage("Please tell me a joke."));
		MessageInput input = new MessageInput(ClaudeModelNames.CLAUDE_3_OPUS.getModelName(), messages, 1000);
		Message message = ai.createMessage(input);
		message.getContent().stream().forEach(content -> {
			if (content instanceof TextContent textContent) {
				System.out.println(textContent.getText());
			}
		});
	}
}
