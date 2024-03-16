/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="invalid_request_error", type=InvalidRequestError.class),
	    @JsonbSubtype(alias="authentication_error", type=AuthenticationError.class),
	    @JsonbSubtype(alias="permission_error", type=PermissionError.class),
	    @JsonbSubtype(alias="not_found_error", type=NotFoundError.class),
	    @JsonbSubtype(alias="rate_limit_error", type=RateLimitError.class),
	    @JsonbSubtype(alias="api_error", type=APIError.class),
	    @JsonbSubtype(alias="overloaded_error", type=OverloadedError.class),
	}
)
public abstract class Error implements Serializable {

	@JsonbProperty
	private String message;
	
	@JsonbTransient
	private final int statusCode;

	/**
	 * @param statusCode
	 */
	protected Error(int statusCode) {
		super();
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
