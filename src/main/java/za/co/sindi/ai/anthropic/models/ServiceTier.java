/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 25 May 2025
 * @see <a href="https://docs.anthropic.com/en/api/messages">Messages</a>
 */
public enum ServiceTier {
	AUTO("auto")
	,STANDARD_ONLY("standard_only")
	;
	private final String tier;

	/**
	 * @param tier
	 */
	private ServiceTier(String tier) {
		this.tier = tier;
	}
	
	public static ServiceTier of(final String value) {
		for (ServiceTier tier : values()) {
			if (tier.tier.equals(value)) return tier;
		}
		
		throw new IllegalArgumentException("Invalid service tier '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tier;
	}
}
