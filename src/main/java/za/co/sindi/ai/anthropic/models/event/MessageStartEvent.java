package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Message;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class MessageStartEvent extends Event {

	@JsonbProperty
	private Message message;

	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}
}
