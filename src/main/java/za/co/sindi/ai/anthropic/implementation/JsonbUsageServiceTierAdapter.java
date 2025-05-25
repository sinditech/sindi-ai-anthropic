/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.Usage.ServiceTier;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbUsageServiceTierAdapter implements JsonbAdapter<ServiceTier, String> {

	@Override
	public String adaptToJson(ServiceTier format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ServiceTier adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ServiceTier.of(value);
	}
}
