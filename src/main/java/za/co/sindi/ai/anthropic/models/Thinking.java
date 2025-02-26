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
	    @JsonbSubtype(alias="enabled", type=EnabledThinking.class),
	    @JsonbSubtype(alias="disabled", type=DisabledThinking.class),
	}
)
public abstract class Thinking implements Serializable {
	
}
