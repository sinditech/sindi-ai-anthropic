package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class CompletionEvent extends Event {

	@JsonbProperty
	private String completion;
	
	@JsonbProperty("stop_reason")
	private String stopReason;
	
	@JsonbProperty
	private String model;

	/**
	 * @return the completion
	 */
	public String getCompletion() {
		return completion;
	}

	/**
	 * @param completion the completion to set
	 */
	public void setCompletion(String completion) {
		this.completion = completion;
	}

	/**
	 * @return the stopReason
	 */
	public String getStopReason() {
		return stopReason;
	}

	/**
	 * @param stopReason the stopReason to set
	 */
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
