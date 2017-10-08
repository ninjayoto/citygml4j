package org.citygml4j.builder.json.objects;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SemanticsTypeAdapter implements JsonSerializer<SemanticsType>, JsonDeserializer<SemanticsType> {

	@Override
	public JsonElement serialize(SemanticsType semantics, Type typeOfSrc, JsonSerializationContext context) {
		if (semantics == SemanticsType.NULL_VALUE)
			return new JsonObject();

		JsonObject object = new JsonObject();
		object.add("type", new JsonPrimitive(semantics.getType().getValue()));

		// serialize properties
		if (semantics.isSetProperties()) {
			JsonObject properties = context.serialize(semantics.getProperties()).getAsJsonObject();
			for (Entry<String, JsonElement> entry : properties.entrySet())
				object.add(entry.getKey(), entry.getValue());
		}

		return object;
	}

	@Override
	public SemanticsType deserialize(JsonElement json, Type typeOfSrc, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = json.getAsJsonObject();
		JsonPrimitive type = object.getAsJsonPrimitive("type");

		if (type != null) {		
			SemanticsTypeName semanticsType = SemanticsTypeName.fromValue(type.getAsString());
			if (semanticsType != null) {
				SemanticsType semantics = new SemanticsType(semanticsType);

				// deserialize properties
				for (Entry<String, JsonElement> entry : object.entrySet()) {
					String key = entry.getKey();					
					if (key.equals("type"))
						continue;
						
					JsonElement value = entry.getValue();
					if (value.isJsonPrimitive()) {
						JsonPrimitive primitive = entry.getValue().getAsJsonPrimitive();
						if (primitive != null) {
							if (primitive.isBoolean())
								semantics.addProperty(key, primitive.getAsBoolean());
							else if (primitive.isNumber())
								semantics.addProperty(key, primitive.getAsNumber());
							else if (primitive.isString())
								semantics.addProperty(key, primitive.getAsString());
							else
								semantics.addProperty(key, context.deserialize(primitive, Object.class));
						}
					} else
						semantics.addProperty(key, context.deserialize(value, Object.class));	
				}

				return semantics;
			}
		}

		return SemanticsType.NULL_VALUE;
	}

}
