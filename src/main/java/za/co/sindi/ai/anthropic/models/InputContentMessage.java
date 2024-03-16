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
