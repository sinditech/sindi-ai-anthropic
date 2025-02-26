/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.anthropic.models.StopReason;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbStopReasonAdapter implements JsonbAdapter<StopReason, String> {

	@Override
	public String adaptToJson(StopReason format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public StopReason adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return StopReason.of(value);
	}
}
