/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum DocumentMediaType {
	PDF("application/pdf")
	;
	private final String mediaType;

	/**
	 * @param mediaType
	 */
	private DocumentMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public static DocumentMediaType of(final String value) {
		for (DocumentMediaType format : values()) {
			if (format.mediaType.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid document media type '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mediaType;
	}
}
