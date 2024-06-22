package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.JsonObject;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import za.co.sindi.ai.anthropic.implementation.JsonObjectJsonbAdapter;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
public class Tool implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty("input_schema")
	@JsonbTypeAdapter(JsonObjectJsonbAdapter.class)
	private JsonObject inputSchema;

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
	public JsonObject getInputSchema() {
		return inputSchema;
	}

	/**
	 * @param inputSchema the inputSchema to set
	 */
	public void setInputSchema(JsonObject inputSchema) {
		this.inputSchema = inputSchema;
	}
}
