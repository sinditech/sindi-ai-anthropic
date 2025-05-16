/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageContent extends CacheControlContent {

	@JsonbProperty
	private ContentSource source;

	/**
	 * @return the source
	 */
	public ContentSource getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(ContentSource source) {
		this.source = source;
	}
}
