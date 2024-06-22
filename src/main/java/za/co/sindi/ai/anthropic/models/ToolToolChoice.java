package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
public class ToolToolChoice extends ToolChoice {

	@JsonbProperty
	private String name;
}
