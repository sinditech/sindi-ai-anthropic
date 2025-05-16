package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class RequestPageLocationCitation extends RequestLocationCitation {
	
	@JsonbProperty("document_index")
	private int documentIndex;
	
	@JsonbProperty("document_title")
	private String documentTitle;

	@JsonbProperty("end_page_number")
	private int endPageNumber;
	
	@JsonbProperty("start_page_number")
	private int startPageNumber;

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
	 * @return the endPageNumber
	 */
	public int getEndPageNumber() {
		return endPageNumber;
	}

	/**
	 * @param endPageNumber the endPageNumber to set
	 */
	public void setEndPageNumber(int endPageNumber) {
		this.endPageNumber = endPageNumber;
	}

	/**
	 * @return the startPageNumber
	 */
	public int getStartPageNumber() {
		return startPageNumber;
	}

	/**
	 * @param startPageNumber the startPageNumber to set
	 */
	public void setStartPageNumber(int startPageNumber) {
		this.startPageNumber = startPageNumber;
	}
}
