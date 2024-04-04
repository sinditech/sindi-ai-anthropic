/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class Usage implements Serializable {

	@JsonbProperty("input_tokens")
	private int inputTokens;
	
	@JsonbProperty("output_tokens")
	private int outputTokens;

	/**
	 * @return the inputTokens
	 */
	public int getInputTokens() {
		return inputTokens;
	}

	/**
	 * @param inputTokens the inputTokens to set
	 */
	public void setInputTokens(int inputTokens) {
		this.inputTokens = inputTokens;
	}

	/**
	 * @return the outputTokens
	 */
	public int getOutputTokens() {
		return outputTokens;
	}

	/**
	 * @param outputTokens the outputTokens to set
	 */
	public void setOutputTokens(int outputTokens) {
		this.outputTokens = outputTokens;
	}
}
