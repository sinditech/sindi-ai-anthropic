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
	private RequestLocationCitation[] citations;

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
	public RequestLocationCitation[] getCitations() {
		return citations;
	}

	/**
	 * @param citations the citations to set
	 */
	public void setCitations(RequestLocationCitation[] citations) {
		this.citations = citations;
	}
}
