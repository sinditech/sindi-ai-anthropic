package za.co.sindi.ai.anthropic.models.event;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="text_delta", type=TextDelta.class),
	    @JsonbSubtype(alias="input_json_delta", type=InputJSONDelta.class)
	}
)
public abstract class Delta implements Serializable {

}
