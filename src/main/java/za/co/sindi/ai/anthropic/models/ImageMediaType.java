/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum ImageMediaType {
	JPEG("image/jpeg")
	,PNG("image/png")
	,GIF("image/gif")
	,WEBP("image/webp")
	;
	private final String mediaType;

	/**
	 * @param mediaType
	 */
	private ImageMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public static ImageMediaType of(final String value) {
		for (ImageMediaType format : values()) {
			if (format.mediaType.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid image media type '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
