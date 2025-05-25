/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class CodeExecutionToolResultContent extends Content {

	@JsonbProperty
	private CodeExecutionResultContent content;
	
	@JsonbProperty("tool_use_id")
	private String toolUseId;

	/**
	 * @return the content
	 */
	public CodeExecutionResultContent getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(CodeExecutionResultContent content) {
		this.content = content;
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
}
