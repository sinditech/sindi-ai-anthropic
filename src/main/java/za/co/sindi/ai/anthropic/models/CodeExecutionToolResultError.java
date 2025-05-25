/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
public class CodeExecutionToolResultError extends CodeExecutionResultContent {

	@JsonbProperty("error_code")
	private ToolResultErrorCode errorCode;
	
	/**
	 * @return the errorCode
	 */
	public ToolResultErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(ToolResultErrorCode errorCode) {
		this.errorCode = errorCode;
	}
}
