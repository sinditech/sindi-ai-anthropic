package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
public class AnyToolChoice extends ToolChoice {

	@JsonbProperty("disable_parallel_tool_use")
	private Boolean disableParallelToolUse;

	/**
	 * @return the disableParallelToolUse
	 */
	public Boolean getDisableParallelToolUse() {
		return disableParallelToolUse;
	}

	/**
	 * @param disableParallelToolUse the disableParallelToolUse to set
	 */
	public void setDisableParallelToolUse(Boolean disableParallelToolUse) {
		this.disableParallelToolUse = disableParallelToolUse;
	}
}
