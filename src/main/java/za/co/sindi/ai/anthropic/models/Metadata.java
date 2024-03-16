/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class Metadata implements Serializable {

	@JsonbProperty("user_id")
	private String userId;

	/**
	 * @param userId
	 */
	public Metadata(String userId) {
		super();
		this.userId = userId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
}
