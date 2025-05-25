/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import java.io.InputStream;

import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import za.co.sindi.ai.anthropic.JSONObjectTransformer;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JSONObjectTransformerImpl implements JSONObjectTransformer {
	
	private JsonbConfig newJsonbConfig() {
		JsonbConfig config = new JsonbConfig();
		config.withAdapters(new JsonbCacheControlTypeAdapter(), 
							new JsonbMediaTypeAdapter(), 
							new JsonObjectJsonbAdapter(), 
							new JsonbStopReasonAdapter(), 
							new JsonbWebSearchResultErrorCodeAdapter(),
							new JsonbServiceTierAdapter(),
							new JsonbUsageServiceTierAdapter());
		return config;
	}

	@Override
	public <E> String transform(E object) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).toJson(object);
	}

	@Override
	public <E> E transform(String data, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(data, type);
	}

	@Override
	public <E> E transform(InputStream stream, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(stream, type);
	}
}
