/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum MediaType {
	APPLICATION_PDF("application/pdf")
	,IMAGE_JPEG("image/jpeg")
	,IMAGE_PNG("image/png")
	,IMAGE_GIF("image/gif")
	,IMAGE_WEBP("image/webp")
	,TEXT_PLAIN("text/plain")
	;
	private final String mediaType;

	/**
	 * @param mediaType
	 */
	private MediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public static MediaType of(final String value) {
		for (MediaType format : values()) {
			if (format.mediaType.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid media type '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mediaType;
	}
}
