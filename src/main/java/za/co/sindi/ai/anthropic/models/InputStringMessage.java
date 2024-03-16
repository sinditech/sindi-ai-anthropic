/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class InputStringMessage extends InputMessage<String> {

	@JsonbProperty
	private String content;
	
	/**
	 * 
	 */
	public InputStringMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public InputStringMessage(String content) {
		super();
		this.content = content;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}
}
