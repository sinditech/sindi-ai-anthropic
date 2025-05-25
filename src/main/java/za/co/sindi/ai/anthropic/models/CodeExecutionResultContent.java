/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 16 May 2025
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="code_execution_result", type=CodeExecutionResult.class),
	    @JsonbSubtype(alias="code_execution_tool_result_error", type=CodeExecutionToolResultError.class),
	}
)
public abstract class CodeExecutionResultContent implements Serializable {

}
