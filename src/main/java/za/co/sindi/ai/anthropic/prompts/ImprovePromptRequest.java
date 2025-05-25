/**
 * 
 */
package za.co.sindi.ai.anthropic.prompts;

import za.co.sindi.ai.anthropic.BaseAPIRequest;
import za.co.sindi.ai.anthropic.models.Content;

/**
 * @author Buhake Sindi
 * @since 25 May 2025
 */
public class ImprovePromptRequest extends BaseAPIRequest<ImprovePromptInput> {
	
	/**
	 * @param uri
	 * @param messages
	 */
	public ImprovePromptRequest(String uri, Content[] messages) {
		this(uri, new ImprovePromptInput(messages));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param input
	 */
	public ImprovePromptRequest(String uri, ImprovePromptInput input) {
		super(uri, input);
		// TODO Auto-generated constructor stub
	}
}
