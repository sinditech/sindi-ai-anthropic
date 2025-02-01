package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class InputJSONDelta extends Delta {

	@JsonbProperty("partial_json")
	private String partialJSON;

	/**
	 * @return the partialJSON
	 */
	public String getPartialJSON() {
		return partialJSON;
	}

	/**
	 * @param partialJSON the partialJSON to set
	 */
	public void setPartialJSON(String partialJSON) {
		this.partialJSON = partialJSON;
	}
}
