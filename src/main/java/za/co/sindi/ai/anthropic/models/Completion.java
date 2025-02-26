/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/claude/reference/complete_post">Anthropic API reference documentation.</a>
 */
public class Completion implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private String completion;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty("stop_reason")
	private StopReason stopReason;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

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

	/**
	 * @return the stopReason
	 */
	public StopReason getStopReason() {
		return stopReason;
	}

	/**
	 * @param stopReason the stopReason to set
	 */
	public void setStopReason(StopReason stopReason) {
		this.stopReason = stopReason;
	}
}
