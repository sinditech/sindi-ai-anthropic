/**
 * 
 */
package za.co.sindi.ai.anthropic.prompts;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Content;

/**
 * Templatize a prompt by indentifying and extracting variables
 * 
 * @author Buhake Sindi
 * @since 25 May 2025
 * @see <a href="https://docs.anthropic.com/en/api/prompt-tools-generate">Anthropic API reference documentation.</a>
 */
public class TemplatePromptInput implements Serializable {

	@JsonbProperty
	private Content[] messages;
	
	@JsonbProperty
	private String system;
	
	/**
	 * @param messages
	 */
	public TemplatePromptInput(Content[] messages) {
		super();
		this.messages = Objects.requireNonNull(messages, "Message contents are required.");
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
}
