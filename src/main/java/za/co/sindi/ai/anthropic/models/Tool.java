package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="custom", type=CustomTool.class),
	    @JsonbSubtype(alias="computer_20241022", type=ComputerUseTool_20240122.class),
	    @JsonbSubtype(alias="bash_20241022", type=BashTool20241022.class),
	    @JsonbSubtype(alias="text_editor_20241022", type=TextEditorTool_20241022.class),
	    @JsonbSubtype(alias="computer_20250124", type=ComputerUseTool_20250124.class),
	    @JsonbSubtype(alias="bash_20250124", type=BashTool20250124.class),
	    @JsonbSubtype(alias="text_editor_20250124", type=TextEditorTool_20250124.class),
	    @JsonbSubtype(alias="web_search_20250305", type=WebSearchTool_20250305.class),
	}
)
public abstract class Tool implements Serializable {
	
	@JsonbProperty("cache_control")
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
