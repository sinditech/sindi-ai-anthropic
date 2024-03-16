/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.ImageMediaType;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbImageMediaTypeAdapter implements JsonbAdapter<ImageMediaType, String> {

	@Override
	public String adaptToJson(ImageMediaType format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ImageMediaType adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageMediaType.of(value);
	}
}
