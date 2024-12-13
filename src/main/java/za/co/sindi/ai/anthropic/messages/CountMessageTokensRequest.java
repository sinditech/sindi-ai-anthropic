/**
 * 
 */
package za.co.sindi.ai.anthropic.messages;

import java.util.List;

import za.co.sindi.ai.anthropic.BaseAPIRequest;
import za.co.sindi.ai.anthropic.models.CountMessage;
import za.co.sindi.ai.anthropic.models.InputMessage;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CountMessageTokensRequest extends BaseAPIRequest<CountMessage> {
	
	/**
	 * @param uri
	 * @param model
	 * @param messages
	 */
	public CountMessageTokensRequest(String uri, String model, List<InputMessage<?>> messages) {
		this(uri, new CountMessage(model, messages));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param message
	 */
	public CountMessageTokensRequest(String uri, CountMessage message) {
		super(uri, message);
		// TODO Auto-generated constructor stub
	}
}
