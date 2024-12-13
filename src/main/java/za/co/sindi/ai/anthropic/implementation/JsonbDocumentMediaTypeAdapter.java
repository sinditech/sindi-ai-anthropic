/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.DocumentMediaType;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbDocumentMediaTypeAdapter implements JsonbAdapter<DocumentMediaType, String> {

	@Override
	public String adaptToJson(DocumentMediaType format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public DocumentMediaType adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return DocumentMediaType.of(value);
	}
}
