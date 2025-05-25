/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/en/api/prompt-tools-generate">Anthropic API reference documentation.</a>
 */
public class TemplatePrompt implements Serializable {
	
	@JsonbProperty
	private Content[] messages;
	
	@JsonbProperty
	private String system;
	
	@JsonbProperty
	private Usage usage;
	
	@JsonbProperty("variable_values")
	private Map<String, Object> variableValues;

	/**
	 * @return the messages
	 */
	public Content[] getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Content[] messages) {
		this.messages = messages;
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
	 * @return the usage
	 */
	public Usage getUsage() {
		return usage;
	}

	/**
	 * @param usage the usage to set
	 */
	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	/**
	 * @return the variableValues
	 */
	public Map<String, Object> getVariableValues() {
		return variableValues;
	}

	/**
	 * @param variableValues the variableValues to set
	 */
	public void setVariableValues(Map<String, Object> variableValues) {
		this.variableValues = variableValues;
	}
}
