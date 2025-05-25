/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
public class CodeExecutionResult extends CodeExecutionResultContent {

	@JsonbProperty
	private CodeExecutionOutput[] content;
	
	@JsonbProperty("return_code")
	private int returnCode;
	
	@JsonbProperty("stderr")
	private String stdErr;
	
	@JsonbProperty("stdout")
	private String stdOut;

	/**
	 * @return the content
	 */
	public CodeExecutionOutput[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(CodeExecutionOutput[] content) {
		this.content = content;
	}

	/**
	 * @return the returnCode
	 */
	public int getReturnCode() {
		return returnCode;
	}

	/**
	 * @param returnCode the returnCode to set
	 */
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	/**
	 * @return the stdErr
	 */
	public String getStdErr() {
		return stdErr;
	}

	/**
	 * @param stdErr the stdErr to set
	 */
	public void setStdErr(String stdErr) {
		this.stdErr = stdErr;
	}

	/**
	 * @return the stdOut
	 */
	public String getStdOut() {
		return stdOut;
	}

	/**
	 * @param stdOut the stdOut to set
	 */
	public void setStdOut(String stdOut) {
		this.stdOut = stdOut;
	}
}
