package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 25 May 2025
 */
public enum ToolResultErrorCode {
	INVALID_TOOL_INPUT("invalid_tool_input")
	,UNAVAILABLE("unavailable")
	,MAX_USE_EXCEEDED("max_use_exceeded")
	,TOO_MANY_REQUESTS("too_many_requests")
	,QUERY_TOO_LONG("query_too_long")
	,EXECUTION_TIME_EXCEEDED("execution_time_exceeded")
	;
	private final String errorCode;

	/**
	 * @param errorCode
	 */
	private ToolResultErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public static ToolResultErrorCode of(final String errorCode) {
		for (ToolResultErrorCode ec : values()) {
			if (ec.errorCode.equals(errorCode)) return ec;
		}
		
		throw new IllegalArgumentException("Invalid tool result error code '" +  errorCode + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return errorCode;
	}
}