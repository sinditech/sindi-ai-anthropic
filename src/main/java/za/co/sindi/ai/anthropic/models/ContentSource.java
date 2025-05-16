package za.co.sindi.ai.anthropic.models;

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
	    @JsonbSubtype(alias="base64", type=Base64DataContentSource.class),
	    @JsonbSubtype(alias="text", type=PlainTextDataContentSource.class),
	    @JsonbSubtype(alias="content", type=ContentContentSource.class),
	    @JsonbSubtype(alias="url", type=URLContentSource.class),
	}
)
public abstract class ContentSource implements Serializable {

}
