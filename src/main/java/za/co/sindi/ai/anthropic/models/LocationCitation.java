package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
		@JsonbSubtype(alias="char_location", type=CharLocationCitation.class),
	    @JsonbSubtype(alias="page_location", type=PageLocationCitation.class),
		@JsonbSubtype(alias="content_block_location", type=ContentBlockLocationCitation.class),
		@JsonbSubtype(alias="web_search_result_location", type=WebSearchResultLocationCitation.class)
	}
)
public abstract class LocationCitation implements Serializable {

	@JsonbProperty("cited_text")
	private String citedText;
	
	/**
	 * @return the citedText
	 */
	public String getCitedText() {
		return citedText;
	}

	/**
	 * @param citedText the citedText to set
	 */
	public void setCitedText(String citedText) {
		this.citedText = citedText;
	}
}
