/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 25 May 2025
 * @see <a href="https://docs.anthropic.com/en/api/messages#response-container">Anthropic API reference documentation.</a>
 */
public class Container implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty("expires_at")
	private String expiresAt;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the expiresAt
	 */
	public String getExpiresAt() {
		return expiresAt;
	}

	/**
	 * @param expiresAt the expiresAt to set
	 */
	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}
}
