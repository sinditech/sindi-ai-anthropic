/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class DocumentContent extends Content {

	@JsonbProperty
	private ImageSource source;

	/**
	 * @param source
	 */
	public DocumentContent(final ImageSource source) {
		super();
		this.source = source;
	}

	/**
	 * @return the source
	 */
	public ImageSource getSource() {
		return source;
	}
}
