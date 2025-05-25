/**
 * 
 */
package za.co.sindi.ai.anthropic.prompts;

import za.co.sindi.ai.anthropic.BaseAPIRequest;

/**
 * @author Buhake Sindi
 * @since 25 May 2025
 */
public class GeneratePromptRequest extends BaseAPIRequest<PromptInput> {
	
	/**
	 * @param uri
	 * @param task
	 */
	public GeneratePromptRequest(String uri, String task) {
		this(uri, new PromptInput(task));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param input
	 */
	public GeneratePromptRequest(String uri, PromptInput input) {
		super(uri, input);
		// TODO Auto-generated constructor stub
	}
}
