package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class CharLocationCitation extends LocationCitation {
	
	@JsonbProperty("document_index")
	private int documentIndex;
	
	@JsonbProperty("document_title")
	private String documentTitle;

	@JsonbProperty("end_char_index")
	private int endCharacterIndex;
	
	@JsonbProperty("start_char_index")
	private int startCharacterIndex;

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

	/**
	 * @return the endCharacterIndex
	 */
	public int getEndCharacterIndex() {
		return endCharacterIndex;
	}

	/**
	 * @param endCharacterIndex the endCharacterIndex to set
	 */
	public void setEndCharacterIndex(int endCharacterIndex) {
		this.endCharacterIndex = endCharacterIndex;
	}

	/**
	 * @return the startCharacterIndex
	 */
	public int getStartCharacterIndex() {
		return startCharacterIndex;
	}

	/**
	 * @param startCharacterIndex the startCharacterIndex to set
	 */
	public void setStartCharacterIndex(int startCharacterIndex) {
		this.startCharacterIndex = startCharacterIndex;
	}
}
