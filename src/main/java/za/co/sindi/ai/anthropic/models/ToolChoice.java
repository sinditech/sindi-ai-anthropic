package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="auto", type=AutoToolChoice.class),
	    @JsonbSubtype(alias="any", type=AnyToolChoice.class),
	    @JsonbSubtype(alias="tool", type=ToolToolChoice.class),
	}
)
public abstract class ToolChoice implements Serializable {

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
