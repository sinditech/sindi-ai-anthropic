/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.JsonObject;
import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ServerToolUseContent extends CacheControlContent {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String name = "web_search";
	
	@JsonbProperty
	private JsonObject input;

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
	 * @return the input
	 */
	public JsonObject getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(JsonObject input) {
		this.input = input;
	}
}
