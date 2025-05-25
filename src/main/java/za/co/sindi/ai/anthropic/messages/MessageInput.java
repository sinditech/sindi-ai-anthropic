/**
 * 
 */
package za.co.sindi.ai.anthropic.messages;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.anthropic.models.InputMessage;
import za.co.sindi.ai.anthropic.models.McpServer;
import za.co.sindi.ai.anthropic.models.Metadata;
import za.co.sindi.ai.anthropic.models.ServiceTier;
import za.co.sindi.ai.anthropic.models.Thinking;
import za.co.sindi.ai.anthropic.models.Tool;
import za.co.sindi.ai.anthropic.models.ToolChoice;

/**
 * Send a structured list of input messages with text and/or image content, and the model will generate the next message in the conversation.
 * 
 * @author Buhake Sindi
 * @since 16 March 2024
 * @see <a href="https://docs.anthropic.com/claude/reference/messages_post">Anthropic API reference documentation.</a>
 */
public class MessageInput implements Serializable {

	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private List<InputMessage<?>> messages; 
	
	@JsonbProperty
	private String system;
	
	@JsonbProperty("max_tokens")
	private int maxTokens;
	
	@JsonbProperty
	private String container;
	
	@JsonbProperty("mcp_servers")
	private McpServer[] mcpServers;
	
	@JsonbProperty
	private Metadata metadata;
	
	@JsonbProperty("service_tier")
	private ServiceTier serviceTier;
	
	@JsonbProperty("stop_sequences")
	private String[] stopSequences;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private Thinking thinking;
	
	@JsonbProperty("tool_choice")
	private ToolChoice toolChoice;
	
	@JsonbProperty
	private Tool[] tools;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty("top_k")
	private Integer topK;

	/**
	 * @param model
	 * @param messages
	 * @param maxTokens
	 */
	public MessageInput(String model, List<InputMessage<?>> messages, int maxTokens) {
		super();
		this.model = Objects.requireNonNull(model, "A model is required.");
		this.messages = Objects.requireNonNull(messages, "A message is required.");
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the system
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(String system) {
		this.system = system;
	}

	/**
	 * @return the maxTokens
	 */
	public int getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	public void setMaxTokens(int maxTokens) {
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the container
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * @param container the container to set
	 */
	public void setContainer(String container) {
		this.container = container;
	}

	/**
	 * @return the mcpServers
	 */
	public McpServer[] getMcpServers() {
		return mcpServers;
	}

	/**
	 * @param mcpServers the mcpServers to set
	 */
	public void setMcpServers(McpServer[] mcpServers) {
		this.mcpServers = mcpServers;
	}

	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the serviceTier
	 */
	public ServiceTier getServiceTier() {
		return serviceTier;
	}

	/**
	 * @param serviceTier the serviceTier to set
	 */
	public void setServiceTier(ServiceTier serviceTier) {
		this.serviceTier = serviceTier;
	}

	/**
	 * @return the stopSequences
	 */
	public String[] getStopSequences() {
		return stopSequences;
	}

	/**
	 * @param stopSequences the stopSequences to set
	 */
	public void setStopSequences(String[] stopSequences) {
		this.stopSequences = stopSequences;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the thinking
	 */
	public Thinking getThinking() {
		return thinking;
	}

	/**
	 * @param thinking the thinking to set
	 */
	public void setThinking(Thinking thinking) {
		this.thinking = thinking;
	}

	/**
	 * @return the toolChoice
	 */
	public ToolChoice getToolChoice() {
		return toolChoice;
	}

	/**
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
		this.tools = tools;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoice toolChoice) {
		this.toolChoice = toolChoice;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the topK
	 */
	public Integer getTopK() {
		return topK;
	}

	/**
	 * @param topK the topK to set
	 */
	public void setTopK(Integer topK) {
		this.topK = topK;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the messages
	 */
	public List<InputMessage<?>> getMessages() {
		return messages;
	}
}
