package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import za.co.sindi.ai.anthropic.implementation.JsonbMediaTypeAdapter;

/**
 * @author Buhake Sindi
 * @since 01 February 2024
 */
public abstract class DataContentSource extends ContentSource {

	@JsonbProperty
	private String data;
	
	@JsonbProperty("media_type")
	@JsonbTypeAdapter(JsonbMediaTypeAdapter.class)
	private MediaType mediaType;
}
