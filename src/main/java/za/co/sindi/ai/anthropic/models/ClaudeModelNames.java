/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 17 March 2024
 */
public enum ClaudeModelNames {
	CLAUDE_3_OPUS("claude-3-opus-20240229")
	,CLAUDE_3_SONNET("claude-3-sonnet-20240229")
	,CLAUDE_3_HAIKU("claude-3-haiku-20240307")
	,CLAUDE_2_1("claude-2.1")
	,CLAUDE_2_0("claude-2.0")
	,CLAUDE_INSTANT_1_2("claude-instant-1.2")
	;
	private final String modelName;

	/**
	 * @param modelName
	 */
	private ClaudeModelNames(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelName;
	}
}
