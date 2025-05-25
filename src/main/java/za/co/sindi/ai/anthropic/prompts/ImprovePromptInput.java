/**
 * 
 */
package za.co.sindi.ai.anthropic.prompts;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Content;

/**
 * Generate a well-written prompt.
 * 
 * @author Buhake Sindi
 * @since 25 May 2025
 * @see <a href="https://docs.anthropic.com/en/api/prompt-tools-generate">Anthropic API reference documentation.</a>
 */
public class ImprovePromptInput implements Serializable {

	@JsonbProperty
	private Content[] messages;
	
	@JsonbProperty
	private String feedback;
	
	@JsonbProperty
	private String system;
	
	@JsonbProperty("target_model")
	private String targetModel;

	/**
	 * @param messages
	 */
	public ImprovePromptInput(Content[] messages) {
		super();
		this.messages = Objects.requireNonNull(messages, "Message contents are required.");
	}

	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	/**
	 * @return the system
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(String system) {
		this.system = system;
	}


	/**
	 * @return the messages
	 */
	public Content[] getMessages() {
		return messages;
	}


	/**
	 * @return the targetModel
	 */
	public String getTargetModel() {
		return targetModel;
	}

	/**
	 * @param targetModel the targetModel to set
	 */
	public void setTargetModel(String targetModel) {
		this.targetModel = targetModel;
	}
}
