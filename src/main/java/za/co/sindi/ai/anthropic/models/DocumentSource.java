/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import za.co.sindi.ai.anthropic.implementation.JsonbDocumentMediaTypeAdapter;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class DocumentSource implements Serializable {

	@JsonbProperty
	private String type;
	
	@JsonbProperty("media_type")
	@JsonbTypeAdapter(JsonbDocumentMediaTypeAdapter.class)
	private DocumentMediaType mediaType;
	
	@JsonbProperty
	private String data;

	/**
	 * @param type
	 * @param mediaType
	 * @param data
	 */
	public DocumentSource(String type, DocumentMediaType mediaType, String data) {
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
	public DocumentMediaType getMediaType() {
		return mediaType;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
}
