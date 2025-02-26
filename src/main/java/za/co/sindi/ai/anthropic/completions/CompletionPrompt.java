/**
 * 
 */
package za.co.sindi.ai.anthropic.completions;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Metadata;

/**
 * Send a structured list of input messages with text and/or image content, and the model will generate the next message in the conversation.
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/claude/reference/complete_post">Anthropic API reference documentation.</a>
 */
public class CompletionPrompt implements Serializable {

	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String prompt; 
	
	@JsonbProperty("max_tokens_to_sample")
	private int maxTokensToSample;
	
	@JsonbProperty("stop_sequences")
	private String[] stopSequences;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty("top_k")
	private Integer topK;
	
	@JsonbProperty
	private Metadata metadata;

	/**
	 * @param model
	 * @param prompt
	 * @param maxTokensToSample
	 */
	public CompletionPrompt(String model, String prompt, int maxTokensToSample) {
		super();
		this.model = Objects.requireNonNull(model, "A model is required.");
		this.prompt = Objects.requireNonNull(prompt, "A prompt is required.");
		this.maxTokensToSample = maxTokensToSample;
	}

	/**
	 * @return the stopSequences
	 */
	public String[] getStopSequences() {
		return stopSequences;
	}

	/**
	 * @param stopSequences the stopSequences to set
	 */
	public void setStopSequences(String[] stopSequences) {
		this.stopSequences = stopSequences;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the topK
	 */
	public Integer getTopK() {
		return topK;
	}

	/**
	 * @param topK the topK to set
	 */
	public void setTopK(Integer topK) {
		this.topK = topK;
	}

	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the prompt
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * @return the maxTokensToSample
	 */
	public int getMaxTokensToSample() {
		return maxTokensToSample;
	}
}
