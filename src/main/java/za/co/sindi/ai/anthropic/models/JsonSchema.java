package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create#chat-create-prediction">OpenAI API reference documentation.</a>
 */
public class JsonSchema implements Serializable {

	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Schema schema;
	
	@JsonbProperty
	private Boolean strict;

	/**
	 * @param name
	 */
	public JsonSchema(String name) {
		super();
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
	 * @return the schema
	 */
	public Schema getSchema() {
		return schema;
	}

	/**
	 * @param schema the schema to set
	 */
	public void setSchema(Schema schema) {
		this.schema = schema;
	}

	/**
	 * @return the strict
	 */
	public Boolean getStrict() {
		return strict;
	}

	/**
	 * @param strict the strict to set
	 */
	public void setStrict(Boolean strict) {
		this.strict = strict;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
