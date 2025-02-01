package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class ContentContentSource extends ContentSource {

	@JsonbProperty
	private Content[] content;

	/**
	 * @return the content
	 */
	public Content[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content[] content) {
		this.content = content;
	}
}
