package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class RequestContentBlockLocationCitation extends RequestLocationCitation {

	@JsonbProperty("end_block_index")
	private int endBlockIndex;
	
	@JsonbProperty("start_block_index")
	private int startBlockIndex;

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
