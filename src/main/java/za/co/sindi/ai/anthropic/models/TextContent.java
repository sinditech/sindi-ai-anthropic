/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class TextContent extends Content {

	@JsonbProperty
	private String text;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
