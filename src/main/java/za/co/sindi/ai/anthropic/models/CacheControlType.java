/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum CacheControlType {
	EPHEMERAL("ephemeral")
	;
	private final String type;

	/**
	 * @param type
	 */
	private CacheControlType(String type) {
		this.type = type;
	}
	
	public static CacheControlType of(final String value) {
		for (CacheControlType cacheControl : values()) {
			if (cacheControl.type.equals(value)) return cacheControl;
		}
		
		throw new IllegalArgumentException("Invalid cache-control type '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type;
	}
}
