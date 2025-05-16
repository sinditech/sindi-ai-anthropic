/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 May 2025
 */
public class WebSearchTool_20250305 extends Tool {
	
	@JsonbProperty("allowed_domains")
	private String[] allowedDomains;
	
	@JsonbProperty("blocked_domains")
	private String[] blockedDomains;
	
	@JsonbProperty("max_uses")
	private Integer maxUses;
	
	@JsonbProperty("user_location")
	private UserLocation userLocation;
	
	/**
	 * @return the allowedDomains
	 */
	public String[] getAllowedDomains() {
		return allowedDomains;
	}

	/**
	 * @param allowedDomains the allowedDomains to set
	 */
	public void setAllowedDomains(String[] allowedDomains) {
		this.allowedDomains = allowedDomains;
	}

	/**
	 * @return the blockedDomains
	 */
	public String[] getBlockedDomains() {
		return blockedDomains;
	}

	/**
	 * @param blockedDomains the blockedDomains to set
	 */
	public void setBlockedDomains(String[] blockedDomains) {
		this.blockedDomains = blockedDomains;
	}

	/**
	 * @return the maxUses
	 */
	public Integer getMaxUses() {
		return maxUses;
	}

	/**
	 * @param maxUses the maxUses to set
	 */
	public void setMaxUses(Integer maxUses) {
		this.maxUses = maxUses;
	}

	/**
	 * @return the userLocation
	 */
	public UserLocation getUserLocation() {
		return userLocation;
	}

	/**
	 * @param userLocation the userLocation to set
	 */
	public void setUserLocation(UserLocation userLocation) {
		this.userLocation = userLocation;
	}

	public static class UserLocation implements Serializable {
		
		@JsonbProperty
		private String type = "approximate";
		
		@JsonbProperty
		private String city;
		
		@JsonbProperty
		private String country;
		
		@JsonbProperty
		private String region;

		@JsonbProperty
		private String timezone;

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * @param country the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}

		/**
		 * @return the region
		 */
		public String getRegion() {
			return region;
		}

		/**
		 * @param region the region to set
		 */
		public void setRegion(String region) {
			this.region = region;
		}

		/**
		 * @return the timezone
		 */
		public String getTimezone() {
			return timezone;
		}

		/**
		 * @param timezone the timezone to set
		 */
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
	}
}
