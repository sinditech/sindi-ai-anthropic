package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
		@JsonbSubtype(alias="char_location", type=RequestCharLocationCitation.class),
	    @JsonbSubtype(alias="page_location", type=RequestPageLocationCitation.class),
		@JsonbSubtype(alias="content_block_location", type=RequestContentBlockLocationCitation.class)
	}
)
public abstract class RequestLocationCitation implements Serializable {

	@JsonbProperty("cited_text")
	private String citedText;
	
	@JsonbProperty("document_index")
	private int documentIndex;
	
	@JsonbProperty("document_title")
	private String documentTitle;

	/**
	 * @return the citedText
	 */
	public String getCitedText() {
		return citedText;
	}

	/**
	 * @param citedText the citedText to set
	 */
	public void setCitedText(String citedText) {
		this.citedText = citedText;
	}

	/**
	 * @return the documentIndex
	 */
	public int getDocumentIndex() {
		return documentIndex;
	}

	/**
	 * @param documentIndex the documentIndex to set
	 */
	public void setDocumentIndex(int documentIndex) {
		this.documentIndex = documentIndex;
	}

	/**
	 * @return the documentTitle
	 */
	public String getDocumentTitle() {
		return documentTitle;
	}

	/**
	 * @param documentTitle the documentTitle to set
	 */
	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}
}
