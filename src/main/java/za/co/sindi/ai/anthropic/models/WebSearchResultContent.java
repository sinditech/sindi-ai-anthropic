/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="web_search_result", type=WebSearchResult.class),
	    @JsonbSubtype(alias="web_search_tool_result_error", type=WebSearchToolResultError.class),
	}
)
public abstract class WebSearchResultContent implements Serializable {

}
