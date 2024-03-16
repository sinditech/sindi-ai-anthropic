/**
 * 
 */
package za.co.sindi.ai.anthropic;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public interface APIRequest<T> {

	public String getUri();
	
	public T getRequestBody();
}
