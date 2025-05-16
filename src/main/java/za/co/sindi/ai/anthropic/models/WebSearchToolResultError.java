/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
public class WebSearchToolResultError extends WebSearchResultContent {

	@JsonbProperty("error_code")
	private ErrorCode errorCode;
	
	/**
	 * @return the errorCode
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static enum ErrorCode {
		
		;
		private final String errorCode;

		/**
		 * @param errorCode
		 */
		private ErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		
		public static ErrorCode of(final String errorCode) {
			for (ErrorCode ec : values()) {
				if (ec.errorCode.equals(errorCode)) return ec;
			}
			
			throw new IllegalArgumentException("Invalid error code '" +  errorCode + "'.");
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return errorCode;
		}
	}
}
