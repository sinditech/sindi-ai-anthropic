/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.MediaType;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbMediaTypeAdapter implements JsonbAdapter<MediaType, String> {

	@Override
	public String adaptToJson(MediaType format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public MediaType adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return MediaType.of(value);
	}
}
