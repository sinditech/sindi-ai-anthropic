/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.WebSearchToolResultError.ErrorCode;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbWebSearchResultErrorCodeAdapter implements JsonbAdapter<ErrorCode, String> {

	@Override
	public String adaptToJson(ErrorCode format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ErrorCode adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ErrorCode.of(value);
	}
}
