package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.Error;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class ErrorEvent extends Event {

	@JsonbProperty
	private Error error;

	/**
	 * @return the error
	 */
	public Error getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}
}
