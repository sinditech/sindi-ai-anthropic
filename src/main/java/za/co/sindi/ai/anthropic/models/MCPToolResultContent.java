/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class MCPToolResultContent extends Content {

	@JsonbProperty("tool_use_id")
	private String toolUseId;
	
	@JsonbProperty("is_error")
	private Boolean error;
	
	@JsonbProperty
	private Object content;

	/**
	 * 
	 */
	public MCPToolResultContent() {
		super();
		//TODO Auto-generated constructor stub
	}

	/**
	 * @param toolUseId
	 */
	public MCPToolResultContent(String toolUseId) {
		super();
		this.toolUseId = Objects.requireNonNull(toolUseId);
	}

	/**
	 * @return the toolUseId
	 */
	public String getToolUseId() {
		return toolUseId;
	}

	/**
	 * @param toolUseId the toolUseId to set
	 */
	public void setToolUseId(String toolUseId) {
		this.toolUseId = toolUseId;
	}

	/**
	 * @return the error
	 */
	public Boolean getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Boolean error) {
		this.error = error;
	}

	/**
	 * @return the content
	 */
	public Object getContent() {
		if (content == null) return null;
		if (content instanceof String) return (String)content;
		if (content instanceof TextContent[]) return (TextContent[]) content;
		
		throw new IllegalStateException("Invalid content.");
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * @param content the content to set
	 */
	public void setContent(TextContent[] content) {
		this.content = content;
	}
}
