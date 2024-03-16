/**
 * 
 */
package za.co.sindi.ai.anthropic.messages;

import java.util.List;

import za.co.sindi.ai.anthropic.BaseAPIRequest;
import za.co.sindi.ai.anthropic.models.InputMessage;
import za.co.sindi.ai.anthropic.models.MessageInput;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CreateMessageRequest extends BaseAPIRequest<MessageInput> {
	
	/**
	 * @param uri
	 * @param model
	 * @param messages
	 * @param maxTokens
	 */
	public CreateMessageRequest(String uri, String model, List<InputMessage<?>> messages, int maxTokens) {
		this(uri, new MessageInput(model, messages, maxTokens));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param input
	 */
	public CreateMessageRequest(String uri, MessageInput input) {
		super(uri, input);
		// TODO Auto-generated constructor stub
	}
}
