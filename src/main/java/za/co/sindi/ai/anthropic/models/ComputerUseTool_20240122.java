/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 May 2025
 */
public class ComputerUseTool_20240122 extends Tool {
	
	@JsonbProperty
	private int displayHeightPixels;
	
	@JsonbProperty
	private int displayWidthPixels;
	
	@JsonbProperty
	private Integer displayNumber;

	/**
	 * @return the displayHeightPixels
	 */
	public int getDisplayHeightPixels() {
		return displayHeightPixels;
	}

	/**
	 * @param displayHeightPixels the displayHeightPixels to set
	 */
	public void setDisplayHeightPixels(int displayHeightPixels) {
		this.displayHeightPixels = displayHeightPixels;
	}

	/**
	 * @return the displayWidthPixels
	 */
	public int getDisplayWidthPixels() {
		return displayWidthPixels;
	}

	/**
	 * @param displayWidthPixels the displayWidthPixels to set
	 */
	public void setDisplayWidthPixels(int displayWidthPixels) {
		this.displayWidthPixels = displayWidthPixels;
	}

	/**
	 * @return the displayNumber
	 */
	public Integer getDisplayNumber() {
		return displayNumber;
	}

	/**
	 * @param displayNumber the displayNumber to set
	 */
	public void setDisplayNumber(Integer displayNumber) {
		this.displayNumber = displayNumber;
	}
}
