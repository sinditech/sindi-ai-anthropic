/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://docs.anthropic.com/en/api/models">Models - Anthropic API reference documentation.</a>
 */
public class Model implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty("display_name")
	private String displayName;
	
	@JsonbProperty("created_at")
	private String createdAt;

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}
