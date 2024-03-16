/**
 * 
 */
package za.co.sindi.ai.anthropic;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class AnthropicAIException extends RuntimeException {

	private za.co.sindi.ai.anthropic.models.Error error;

	/**
	 * @param error
	 */
	public AnthropicAIException(za.co.sindi.ai.anthropic.models.Error error) {
		super(error.getMessage() + " (status code: " + error.getStatusCode() + ").");
		this.error = error;
	}

	/**
	 * @param message
	 */
	public AnthropicAIException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the error
	 */
	public za.co.sindi.ai.anthropic.models.Error getError() {
		return error;
	}
}
