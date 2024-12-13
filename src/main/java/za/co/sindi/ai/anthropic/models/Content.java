/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="text", type=TextContent.class),
	    @JsonbSubtype(alias="image", type=ImageContent.class),
	    @JsonbSubtype(alias="tool_use", type=ToolUseContent.class),
	    @JsonbSubtype(alias="tool_result", type=ToolResultContent.class),
	    @JsonbSubtype(alias="document", type=DocumentContent.class),
	}
)
public abstract class Content implements Serializable {

	@JsonbProperty("cache-control")
	private CacheControl cacheControl;
}
