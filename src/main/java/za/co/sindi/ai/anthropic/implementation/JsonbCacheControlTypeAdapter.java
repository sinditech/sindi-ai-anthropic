/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.CacheControlType;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbCacheControlTypeAdapter implements JsonbAdapter<CacheControlType, String> {

	@Override
	public String adaptToJson(CacheControlType type) throws Exception {
		// TODO Auto-generated method stub
		if (type == null) return null;
		return type.toString();
	}

	@Override
	public CacheControlType adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return CacheControlType.of(value);
	}
}
