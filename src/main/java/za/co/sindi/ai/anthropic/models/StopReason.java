/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum StopReason {
	END_TURN("end_turn")
	,MAX_TOKENS("max_tokens")
	,STOP_SEQUENCE("stop_sequence")
	,TOOL_USE("tool_use")
	;
	private final String stopReason;

	/**
	 * @param stopReason
	 */
	private StopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	
	public static StopReason of(final String value) {
		for (StopReason reason : values()) {
			if (reason.stopReason.equals(value)) return reason;
		}
		
		throw new IllegalArgumentException("Invalid stop reason '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stopReason;
	}
}
