package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public class Schema implements Serializable {

	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private Map<String, Property> properties;
	
	@JsonbProperty
	private Boolean additionalProperties;
	
	@JsonbProperty("required")
	private String[] requiredProperties;

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
	 * @return the properties
	 */
	public Map<String, Property> getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}

	/**
	 * @return the additionalProperties
	 */
	public Boolean getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * @param additionalProperties the additionalProperties to set
	 */
	public void setAdditionalProperties(Boolean additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	/**
	 * @return the requiredProperties
	 */
	public String[] getRequiredProperties() {
		return requiredProperties;
	}

	/**
	 * @param requiredProperties the requiredProperties to set
	 */
	public void setRequiredProperties(String[] requiredProperties) {
		this.requiredProperties = requiredProperties;
	}
}
