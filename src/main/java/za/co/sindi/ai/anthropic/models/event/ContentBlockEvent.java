package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public abstract class ContentBlockEvent extends Event {

	@JsonbProperty
	private int index;

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}
