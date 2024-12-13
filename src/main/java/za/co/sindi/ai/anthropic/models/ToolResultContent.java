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
public class ToolResultContent extends Content {

	@JsonbProperty("tool_use_id")
	private String toolUseId;
	
	@JsonbProperty
	private Boolean error;
	
	@JsonbProperty
	private String content;

	/**
	 * 
	 */
	public ToolResultContent() {
		super();
		//TODO Auto-generated constructor stub
	}

	/**
	 * @param toolUseId
	 */
	public ToolResultContent(String toolUseId) {
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
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
