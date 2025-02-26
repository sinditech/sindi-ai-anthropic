/**
 * 
 */
package za.co.sindi.ai.anthropic.messages;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CountMessageTokens implements Serializable {
	
	@JsonbProperty("input_tokens")
	private Integer inputTokens;

	/**
	 * @return the inputTokens
	 */
	public Integer getInputTokens() {
		return inputTokens;
	}

	/**
	 * @param inputTokens the inputTokens to set
	 */
	public void setInputTokens(Integer inputTokens) {
		this.inputTokens = inputTokens;
	}
}
