/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageContent extends Content {

	@JsonbProperty
	private Base64DataContentSource source;

	/**
	 * @param source
	 */
	public ImageContent(final Base64DataContentSource source) {
		super();
		this.source = source;
	}

	/**
	 * @return the source
	 */
	public Base64DataContentSource getSource() {
		return source;
	}
}
