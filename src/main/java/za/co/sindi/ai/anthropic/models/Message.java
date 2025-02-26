/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/claude/reference/messages_post">Anthropic API reference documentation.</a>
 */
public class Message implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private String role;
	
	@JsonbProperty
	private List<Content> content;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty("stop_reason")
	private StopReason stopReason;
	
	@JsonbProperty("stop_sequence")
	private String stopSequence;
	
	@JsonbProperty
	private Usage usage;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the content
	 */
	public List<Content> getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(List<Content> content) {
		this.content = content;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the stopReason
	 */
	public StopReason getStopReason() {
		return stopReason;
	}

	/**
	 * @param stopReason the stopReason to set
	 */
	public void setStopReason(StopReason stopReason) {
		this.stopReason = stopReason;
	}

	/**
	 * @return the stopSequence
	 */
	public String getStopSequence() {
		return stopSequence;
	}

	/**
	 * @param stopSequence the stopSequence to set
	 */
	public void setStopSequence(String stopSequence) {
		this.stopSequence = stopSequence;
	}

	/**
	 * @return the usage
	 */
	public Usage getUsage() {
		return usage;
	}

	/**
	 * @param usage the usage to set
	 */
	public void setUsage(Usage usage) {
		this.usage = usage;
	}
}
