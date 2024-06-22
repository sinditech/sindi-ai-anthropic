/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

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
	}
)
public abstract class Content implements Serializable {

}
