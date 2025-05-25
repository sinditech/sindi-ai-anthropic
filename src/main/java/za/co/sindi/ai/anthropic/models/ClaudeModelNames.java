/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 17 March 2024
 * @see <a href="https://docs.anthropic.com/en/docs/about-claude/models">Model names</a>
 */
public enum ClaudeModelNames {
	CLAUDE_OPUS_4_20250514("claude-opus-4-20250514")
	,CLAUDE_OPUS_4_0("claude-opus-4-0")
	,CLAUDE_SONNET_4_20250514("claude-sonnet-4-20250514")
	,CLAUDE_SONNET_4_0("claude-sonnet-4-0")
	,CLAUDE_3_7_SONNET_20250219("claude-3-7-sonnet-20250219")
	,CLAUDE_3_7_SONNET_LATEST("claude-3-7-sonnet-latest")
	,CLAUDE_3_5_HAIKU_20241022("claude-3-5-haiku-20241022")
	,CLAUDE_3_5_HAIKU_LATEST("claude-3-5-haiku-latest")
	,CLAUDE_3_5_SONNET_20240620("claude-3-5-sonnet-20240620")
	,CLAUDE_3_5_SONNET_20241022("claude-3-5-sonnet-20241022")
	,CLAUDE_3_5_SONNET_LATEST("claude-3-5-sonnet-latest")
	,CLAUDE_3_OPUS("claude-3-opus-20240229")
	,CLAUDE_3_OPUS_LATEST("claude-3-opus-latest")
	,CLAUDE_3_SONNET("claude-3-sonnet-20240229")
	,CLAUDE_3_HAIKU("claude-3-haiku-20240307")
	,CLAUDE_3_HAIKU_20241022("claude-3-haiku-20241022")
	,@Deprecated CLAUDE_3_HAIKU_LATEST("claude-3-haiku-latest")
	,@Deprecated CLAUDE_2_1("claude-2.1")
	,@Deprecated CLAUDE_2_0("claude-2.0")
	,@Deprecated CLAUDE_INSTANT_1_2("claude-instant-1.2")
	;
	public static final ClaudeModelNames CLAUDE_3_5_SONNET_V2 = CLAUDE_3_5_SONNET_LATEST;
	
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
	
	public static ClaudeModelNames getLatest() {
		return CLAUDE_SONNET_4_0;
	}
}
