/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import za.co.sindi.ai.anthropic.implementation.JsonbImageMediaTypeAdapter;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageSource implements Serializable {

	@JsonbProperty
	private String type;
	
	@JsonbProperty("media_type")
	@JsonbTypeAdapter(JsonbImageMediaTypeAdapter.class)
	private ImageMediaType mediaType;
	
	@JsonbProperty
	private String data;

	/**
	 * @param type
	 * @param mediaType
	 * @param data
	 */
	public ImageSource(String type, ImageMediaType mediaType, String data) {
		super();
		this.type = type;
		this.mediaType = mediaType;
		this.data = data;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the mediaType
	 */
	public ImageMediaType getMediaType() {
		return mediaType;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
}
