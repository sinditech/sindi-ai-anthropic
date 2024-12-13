package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CacheControl implements Serializable {

	@JsonbProperty
	private CacheControlType type;

	/**
	 * @return the type
	 */
	public CacheControlType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CacheControlType type) {
		this.type = type;
	}
}
