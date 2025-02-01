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
		@JsonbSubtype(alias="completion", type=CompletionEvent.class),
	    @JsonbSubtype(alias="error", type=ErrorEvent.class),
	    @JsonbSubtype(alias="message_start", type=MessageStartEvent.class),
	    @JsonbSubtype(alias="content_block_start", type=ContentBlockStartEvent.class),
	    @JsonbSubtype(alias="ping", type=PingEvent.class),
	    @JsonbSubtype(alias="content_block_delta", type=ContentBlockDeltaEvent.class),
	    @JsonbSubtype(alias="content_block_stop", type=ContentBlockStopEvent.class),
	    @JsonbSubtype(alias="message_delta", type=MessageDeltaEvent.class),
	    @JsonbSubtype(alias="message_stop", type=MessageStopEvent.class)
	}
)
public abstract class Event implements Serializable {

}
