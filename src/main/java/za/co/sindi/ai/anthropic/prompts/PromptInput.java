/**
 * 
 */
package za.co.sindi.ai.anthropic.prompts;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Generate a well-written prompt.
 * 
 * @author Buhake Sindi
 * @since 25 May 2025
 * @see <a href="https://docs.anthropic.com/en/api/prompt-tools-generate">Anthropic API reference documentation.</a>
 */
public class PromptInput implements Serializable {

	@JsonbProperty
	private String task;
	
	@JsonbProperty("target_model")
	private String targetModel;

	/**
	 * @param task
	 */
	public PromptInput(String task) {
		super();
		this.task = Objects.requireNonNull(task, "A task is required.");
	}

	/**
	 * @return the task
	 */
	public String getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(String task) {
		this.task = task;
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
