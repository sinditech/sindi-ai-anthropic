/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class TextContent extends CacheControlContent {

	@JsonbProperty
	private String text;
	
	@JsonbProperty
	private LocationCitation[] citations;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the citations
	 */
	public LocationCitation[] getCitations() {
		return citations;
	}

	/**
	 * @param citations the citations to set
	 */
	public void setCitations(LocationCitation[] citations) {
		this.citations = citations;
	}
}
