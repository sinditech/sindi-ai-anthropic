package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

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

}
