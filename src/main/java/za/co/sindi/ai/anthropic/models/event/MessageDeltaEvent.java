package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Message;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class MessageDeltaEvent extends Event {

	@JsonbProperty
	private Message delta;

	/**
	 * @return the delta
	 */
	public Message getDelta() {
		return delta;
	}

	/**
	 * @param delta the delta to set
	 */
	public void setDelta(Message delta) {
		this.delta = delta;
	}
}
