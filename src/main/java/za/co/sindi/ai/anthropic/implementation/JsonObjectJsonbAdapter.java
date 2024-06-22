/**
 * 
 */
package za.co.sindi.ai.anthropic.implementation;

import java.io.StringReader;
import java.io.StringWriter;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonWriter;
import jakarta.json.bind.adapter.JsonbAdapter;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonObjectJsonbAdapter implements JsonbAdapter<JsonObject, String> {

	@Override
	public String adaptToJson(JsonObject json) throws Exception {
		// TODO Auto-generated method stub
		if (json == null) return null;
		StringWriter sw = new StringWriter();
		JsonWriter jsonWriter = Json.createWriter(sw);
		jsonWriter.writeObject(json);
		return sw.toString();
	}

	@Override
	public JsonObject adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		JsonReader jsonReader = Json.createReader(new StringReader(value));
		return jsonReader.readObject();
	}
}
