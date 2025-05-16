/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class DocumentContent extends CacheControlContent {

	@JsonbProperty
	private ContentSource source;
	
	@JsonbProperty
	private String context;
	
	@JsonbProperty
	private DocumentCitation citations;
	
	@JsonbProperty
	private String title;

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

	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * @return the citations
	 */
	public DocumentCitation getCitations() {
		return citations;
	}

	/**
	 * @param citations the citations to set
	 */
	public void setCitations(DocumentCitation citations) {
		this.citations = citations;
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
}
