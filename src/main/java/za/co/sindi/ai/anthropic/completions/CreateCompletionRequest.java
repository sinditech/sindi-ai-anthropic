/**
 * 
 */
package za.co.sindi.ai.anthropic.completions;

import za.co.sindi.ai.anthropic.BaseAPIRequest;
import za.co.sindi.ai.anthropic.models.CompletionPrompt;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CreateCompletionRequest extends BaseAPIRequest<CompletionPrompt> {
	
	/**
	 * @param uri
	 * @param model
	 * @param prompt
	 * @param maxTokensToSample
	 */
	public CreateCompletionRequest(String uri, String model, String prompt, int maxTokensToSample) {
		this(uri, new CompletionPrompt(model, prompt, maxTokensToSample));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param prompt
	 */
	public CreateCompletionRequest(String uri, CompletionPrompt prompt) {
		super(uri, prompt);
		// TODO Auto-generated constructor stub
	}
}
