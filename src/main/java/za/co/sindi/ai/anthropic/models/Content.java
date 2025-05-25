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
	    @JsonbSubtype(alias="server_tool_use", type=ServerToolUseContent.class),
	    @JsonbSubtype(alias="mcp_tool_use", type=MCPToolUseContent.class),
	    @JsonbSubtype(alias="tool_result", type=ToolResultContent.class),
	    @JsonbSubtype(alias="web_search_tool_result", type=WebSearchToolResultContent.class),
	    @JsonbSubtype(alias="code_execution_tool_result", type=CodeExecutionToolResultContent.class),
	    @JsonbSubtype(alias="container_upload", type=ContainerUploadContent.class),
	    @JsonbSubtype(alias="document", type=DocumentContent.class),
	    @JsonbSubtype(alias="thinking", type=ThinkingContent.class),
	    @JsonbSubtype(alias="redacted_thinking", type=RedactedThinkingContent.class),
	}
)
public abstract class Content implements Serializable {

}
