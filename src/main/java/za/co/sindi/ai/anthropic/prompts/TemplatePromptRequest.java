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
public class TemplatePromptRequest extends BaseAPIRequest<TemplatePromptInput> {
	
	/**
	 * @param uri
	 * @param messages
	 */
	public TemplatePromptRequest(String uri, Content[] messages) {
		this(uri, new TemplatePromptInput(messages));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param input
	 */
	public TemplatePromptRequest(String uri, TemplatePromptInput input) {
		super(uri, input);
		// TODO Auto-generated constructor stub
	}
}
