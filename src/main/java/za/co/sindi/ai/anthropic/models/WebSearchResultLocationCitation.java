package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class WebSearchResultLocationCitation extends LocationCitation {

	@JsonbProperty("encrypted_index")
	private String encryptedIndex;
	
	@JsonbProperty
	private String title;
	
	@JsonbProperty
	private String url;

	/**
	 * @return the encryptedIndex
	 */
	public String getEncryptedIndex() {
		return encryptedIndex;
	}

	/**
	 * @param encryptedIndex the encryptedIndex to set
	 */
	public void setEncryptedIndex(String encryptedIndex) {
		this.encryptedIndex = encryptedIndex;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
