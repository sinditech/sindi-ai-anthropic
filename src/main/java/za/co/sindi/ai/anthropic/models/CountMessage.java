/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Send a structured list of input messages with text and/or image content, and the model will generate the next message in the conversation.
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/claude/reference/messages_post">Anthropic API reference documentation.</a>
 */
public class CountMessage implements Serializable {

	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private List<InputMessage<?>> messages; 
	
	@JsonbProperty
	private String system;
	
	@JsonbProperty("tool_choice")
	private ToolChoice toolChoice;
	
	@JsonbProperty
	private Tool[] tools;
	

	/**
	 * @param model
	 * @param messages
	 */
	public CountMessage(String model, List<InputMessage<?>> messages) {
		super();
		this.model = Objects.requireNonNull(model, "A model is required.");
		this.messages = Objects.requireNonNull(messages, "A message is required.");
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
	 * @return the toolChoice
	 */
	public ToolChoice getToolChoice() {
		return toolChoice;
	}

	/**
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
		this.tools = tools;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoice toolChoice) {
		this.toolChoice = toolChoice;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the messages
	 */
	public List<InputMessage<?>> getMessages() {
		return messages;
	}
}
