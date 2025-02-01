package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class RequestCharLocationCitation extends RequestLocationCitation {

	@JsonbProperty("end_char_index")
	private int endCharacterIndex;
	
	@JsonbProperty("start_char_index")
	private int startCharacterIndex;

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
