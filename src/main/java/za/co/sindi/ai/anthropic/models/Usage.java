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
	
	@JsonbProperty("cache_creation_input_tokens")
	private int cacheCreationInputTokens;
	
	@JsonbProperty("cache_read_intput_tokens")
	private int cacheReadIntputTokens;

	@JsonbProperty("input_tokens")
	private int inputTokens;
	
	@JsonbProperty("output_tokens")
	private int outputTokens;

	/**
	 * @return the cacheCreationInputTokens
	 */
	public int getCacheCreationInputTokens() {
		return cacheCreationInputTokens;
	}

	/**
	 * @param cacheCreationInputTokens the cacheCreationInputTokens to set
	 */
	public void setCacheCreationInputTokens(int cacheCreationInputTokens) {
		this.cacheCreationInputTokens = cacheCreationInputTokens;
	}

	/**
	 * @return the cacheReadIntputTokens
	 */
	public int getCacheReadIntputTokens() {
		return cacheReadIntputTokens;
	}

	/**
	 * @param cacheReadIntputTokens the cacheReadIntputTokens to set
	 */
	public void setCacheReadIntputTokens(int cacheReadIntputTokens) {
		this.cacheReadIntputTokens = cacheReadIntputTokens;
	}

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
