/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class Property implements Serializable {

	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty("enum")
	private String[] enums;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the enums
	 */
	public String[] getEnums() {
		return enums;
	}

	/**
	 * @param enums the enums to set
	 */
	public void setEnums(String[] enums) {
		this.enums = enums;
	}
}
