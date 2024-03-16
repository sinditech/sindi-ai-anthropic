/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class InputContentMessage extends InputMessage<Content> {

	@JsonbProperty
	private Content content;
	
	/**
	 * 
	 */
	public InputContentMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public InputContentMessage(Content content) {
		super();
		this.content = content;
	}

	@Override
	public Content getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public void setContent(Content content) {
		// TODO Auto-generated method stub
		this.content = content;
	}
}
