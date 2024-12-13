package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
public class Tool implements Serializable {
	
	@JsonbProperty("cache-control")
	private CacheControl cacheControl;

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty("input_schema")
//	@JsonbTypeAdapter(JsonObjectJsonbAdapter.class)
	private JsonSchema inputSchema;

	/**
	 * @return the cacheControl
	 */
	public CacheControl getCacheControl() {
		return cacheControl;
	}

	/**
	 * @param cacheControl the cacheControl to set
	 */
	public void setCacheControl(CacheControl cacheControl) {
		this.cacheControl = cacheControl;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the inputSchema
	 */
	public JsonSchema getInputSchema() {
		return inputSchema;
	}

	/**
	 * @param inputSchema the inputSchema to set
	 */
	public void setInputSchema(JsonSchema inputSchema) {
		this.inputSchema = inputSchema;
	}
}
