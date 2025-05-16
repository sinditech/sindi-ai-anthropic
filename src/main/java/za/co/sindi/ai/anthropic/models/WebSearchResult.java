/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
public class WebSearchResult extends WebSearchResultContent {

	@JsonbProperty("encrypted_content")
	private String encryptedContent;
	
	@JsonbProperty
	private String title;
	
	@JsonbProperty
	private String url;
	
	@JsonbProperty("page_age")
	private String pageAge;

	/**
	 * @return the encryptedContent
	 */
	public String getEncryptedContent() {
		return encryptedContent;
	}

	/**
	 * @param encryptedContent the encryptedContent to set
	 */
	public void setEncryptedContent(String encryptedContent) {
		this.encryptedContent = encryptedContent;
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

	/**
	 * @return the pageAge
	 */
	public String getPageAge() {
		return pageAge;
	}

	/**
	 * @param pageAge the pageAge to set
	 */
	public void setPageAge(String pageAge) {
		this.pageAge = pageAge;
	}
}
