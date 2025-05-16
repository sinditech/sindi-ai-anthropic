/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public abstract class CacheControlContent extends Content {

	@JsonbProperty("cache_control")
	private CacheControl cacheControl;

	/**
	 * @return the cacheControl
	 */
	public CacheControl getCacheControl() {
		return cacheControl;
	}

	/**
	 * @param cacheControl the cacheControl to set
	 */
	public void setCacheControl(CacheControl cacheControl) {
		this.cacheControl = cacheControl;
	}
}
