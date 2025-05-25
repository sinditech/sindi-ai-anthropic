/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class Usage implements Serializable {
	
	@JsonbProperty("cache_creation")
	private CacheCreation cacheCreation;
	
	@JsonbProperty("cache_creation_input_tokens")
	private int cacheCreationInputTokens;
	
	@JsonbProperty("cache_read_intput_tokens")
	private int cacheReadIntputTokens;

	@JsonbProperty("input_tokens")
	private int inputTokens;
	
	@JsonbProperty("output_tokens")
	private int outputTokens;
	
	@JsonbProperty("server_tool_use")
	private ServerToolUse serverToolUse;
	/**
	 * @return the cacheCreation
	 */
	public CacheCreation getCacheCreation() {
		return cacheCreation;
	}

	/**
	 * @param cacheCreation the cacheCreation to set
	 */
	public void setCacheCreation(CacheCreation cacheCreation) {
		this.cacheCreation = cacheCreation;
	}

	/**
	 * @return the cacheCreationInputTokens
	 */
	public int getCacheCreationInputTokens() {
		return cacheCreationInputTokens;
	}

	/**
	 * @param cacheCreationInputTokens the cacheCreationInputTokens to set
	 */
	public void setCacheCreationInputTokens(int cacheCreationInputTokens) {
		this.cacheCreationInputTokens = cacheCreationInputTokens;
	}

	/**
	 * @return the cacheReadIntputTokens
	 */
	public int getCacheReadIntputTokens() {
		return cacheReadIntputTokens;
	}

	/**
	 * @param cacheReadIntputTokens the cacheReadIntputTokens to set
	 */
	public void setCacheReadIntputTokens(int cacheReadIntputTokens) {
		this.cacheReadIntputTokens = cacheReadIntputTokens;
	}

	/**
	 * @return the inputTokens
	 */
	public int getInputTokens() {
		return inputTokens;
	}

	/**
	 * @param inputTokens the inputTokens to set
	 */
	public void setInputTokens(int inputTokens) {
		this.inputTokens = inputTokens;
	}

	/**
	 * @return the outputTokens
	 */
	public int getOutputTokens() {
		return outputTokens;
	}

	/**
	 * @param outputTokens the outputTokens to set
	 */
	public void setOutputTokens(int outputTokens) {
		this.outputTokens = outputTokens;
	}
	
	/**
	 * @return the serverToolUse
	 */
	public ServerToolUse getServerToolUse() {
		return serverToolUse;
	}

	/**
	 * @param serverToolUse the serverToolUse to set
	 */
	public void setServerToolUse(ServerToolUse serverToolUse) {
		this.serverToolUse = serverToolUse;
	}
	
	public static class CacheCreation implements Serializable {
		
		@JsonbProperty("ephemeral_1h_input_tokens")
		private int ephemeralOneHourInputTokens;
		
		@JsonbProperty("ephemeral_5m_input_tokens")
		private int ephemeral5MinutesInputTokens;

		/**
		 * @return the ephemeralOneHourInputTokens
		 */
		public int getEphemeralOneHourInputTokens() {
			return ephemeralOneHourInputTokens;
		}

		/**
		 * @param ephemeralOneHourInputTokens the ephemeralOneHourInputTokens to set
		 */
		public void setEphemeralOneHourInputTokens(int ephemeralOneHourInputTokens) {
			this.ephemeralOneHourInputTokens = ephemeralOneHourInputTokens;
		}

		/**
		 * @return the ephemeral5MinutesInputTokens
		 */
		public int getEphemeral5MinutesInputTokens() {
			return ephemeral5MinutesInputTokens;
		}

		/**
		 * @param ephemeral5MinutesInputTokens the ephemeral5MinutesInputTokens to set
		 */
		public void setEphemeral5MinutesInputTokens(int ephemeral5MinutesInputTokens) {
			this.ephemeral5MinutesInputTokens = ephemeral5MinutesInputTokens;
		}
	}
	
	public static class ServerToolUse implements Serializable {
		
		@JsonbProperty("web_search_requests")
		private int webSearchRequests;

		/**
		 * @return the webSearchRequests
		 */
		public int getWebSearchRequests() {
			return webSearchRequests;
		}

		/**
		 * @param webSearchRequests the webSearchRequests to set
		 */
		public void setWebSearchRequests(int webSearchRequests) {
			this.webSearchRequests = webSearchRequests;
		}
	}
	
	public static enum ServiceTier {
		STANDARD("standard")
		,PRIORITY("priority")
		,BATCH("batch")
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
			
			throw new IllegalArgumentException("Invalid usage service tier '" + value + "'.");
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return tier;
		}
	}
}
