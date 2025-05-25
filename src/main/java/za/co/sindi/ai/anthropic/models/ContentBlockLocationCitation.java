package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class ContentBlockLocationCitation extends LocationCitation {
	
	@JsonbProperty("document_index")
	private int documentIndex;
	
	@JsonbProperty("document_title")
	private String documentTitle;
	
	@JsonbProperty("end_block_index")
	private int endBlockIndex;
	
	@JsonbProperty("start_block_index")
	private int startBlockIndex;

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
	 * @return the endBlockIndex
	 */
	public int getEndBlockIndex() {
		return endBlockIndex;
	}

	/**
	 * @param endBlockIndex the endBlockIndex to set
	 */
	public void setEndBlockIndex(int endBlockIndex) {
		this.endBlockIndex = endBlockIndex;
	}

	/**
	 * @return the startBlockIndex
	 */
	public int getStartBlockIndex() {
		return startBlockIndex;
	}

	/**
	 * @param startBlockIndex the startBlockIndex to set
	 */
	public void setStartBlockIndex(int startBlockIndex) {
		this.startBlockIndex = startBlockIndex;
	}
}
