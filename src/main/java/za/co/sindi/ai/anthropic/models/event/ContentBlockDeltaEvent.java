package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class ContentBlockDeltaEvent extends ContentBlockEvent {

	@JsonbProperty
	private Delta delta;

	/**
	 * @return the delta
	 */
	public Delta getDelta() {
		return delta;
	}

	/**
	 * @param delta the delta to set
	 */
	public void setDelta(Delta delta) {
		this.delta = delta;
	}
}
