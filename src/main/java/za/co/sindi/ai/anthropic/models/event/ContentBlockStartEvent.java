package za.co.sindi.ai.anthropic.models.event;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public class ContentBlockStartEvent extends ContentBlockEvent {

	@JsonbProperty("content_block")
	private TextContentBlock contentBlock;

	/**
	 * @return the contentBlock
	 */
	public TextContentBlock getContentBlock() {
		return contentBlock;
	}

	/**
	 * @param contentBlock the contentBlock to set
	 */
	public void setContentBlock(TextContentBlock contentBlock) {
		this.contentBlock = contentBlock;
	}
}
