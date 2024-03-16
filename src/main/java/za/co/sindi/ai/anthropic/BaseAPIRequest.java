/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public abstract class BaseAPIRequest<T> implements APIRequest<T> {

	private String uri;
	private T requestBody;
	
	/**
	 * @param uri
	 * @param requestBody
	 */
	protected BaseAPIRequest(String uri, T requestBody) {
		super();
		this.uri = Objects.requireNonNull(uri, "A request URI is required.");
		this.requestBody = requestBody;
	}

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return uri;
	}

	@Override
	public T getRequestBody() {
		// TODO Auto-generated method stub
		return requestBody;
	}
}
