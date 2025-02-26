/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ThinkingContent extends Content {

	@JsonbProperty
	private String signature;
	
	@JsonbProperty
	private String thinking;

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the thinking
	 */
	public String getThinking() {
		return thinking;
	}

	/**
	 * @param thinking the thinking to set
	 */
	public void setThinking(String thinking) {
		this.thinking = thinking;
	}
}
