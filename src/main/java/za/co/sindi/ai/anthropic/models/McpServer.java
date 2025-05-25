/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 May 2025
 */
public class McpServer implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String type = "url";
	
	@JsonbProperty
	private String url;
	
	@JsonbProperty("authorization_token")
	private String authorizationToken;
	
	@JsonbProperty("tool_configuration")
	private ToolConfiguration toolConfiguration;
	
	/**
	 * 
	 */
	public McpServer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param url
	 */
	public McpServer(String name, String url) {
		super();
		this.name = Objects.requireNonNull(name, "Name is required.");
		this.url = Objects.requireNonNull(url, "URL is required.");
		this.type = "url";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the authorizationToken
	 */
	public String getAuthorizationToken() {
		return authorizationToken;
	}

	/**
	 * @param authorizationToken the authorizationToken to set
	 */
	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	/**
	 * @return the toolConfiguration
	 */
	public ToolConfiguration getToolConfiguration() {
		return toolConfiguration;
	}

	/**
	 * @param toolConfiguration the toolConfiguration to set
	 */
	public void setToolConfiguration(ToolConfiguration toolConfiguration) {
		this.toolConfiguration = toolConfiguration;
	}
	
	public static class ToolConfiguration implements Serializable {
		
		@JsonbProperty("allowed_tools")
		private String[] allowedTools;
		
		@JsonbProperty
		private Boolean enabled;

		/**
		 * @return the allowedTools
		 */
		public String[] getAllowedTools() {
			return allowedTools;
		}

		/**
		 * @param allowedTools the allowedTools to set
		 */
		public void setAllowedTools(String[] allowedTools) {
			this.allowedTools = allowedTools;
		}

		/**
		 * @return the enabled
		 */
		public Boolean getEnabled() {
			return enabled;
		}

		/**
		 * @param enabled the enabled to set
		 */
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}
}
