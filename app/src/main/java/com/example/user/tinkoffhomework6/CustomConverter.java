package com.example.user.tinkoffhomework6;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by User on 06.11.2017.
 */

public class CustomConverter implements JsonDeserializer<ObjectForDeserialize> {

    @Override
    public ObjectForDeserialize deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = json.getAsJsonObject();
        String string = object.get("name").getAsString();
        HashMap<String, String> map = new HashMap<>();
        if (json.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> entries = object.get("any_map").getAsJsonObject().entrySet();
            for (Map.Entry<String, JsonElement> entriess : entries) {
                map.put(entriess.getKey(), entriess.getValue().getAsString());
            }
        }

        return new ObjectForDeserialize(string, map);
    }
}
