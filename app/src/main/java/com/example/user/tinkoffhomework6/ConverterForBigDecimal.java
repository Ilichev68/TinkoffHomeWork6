package com.example.user.tinkoffhomework6;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * Created by User on 06.11.2017.
 */

public class ConverterForBigDecimal implements JsonDeserializer<ObjectForBigDecimal> {
    @Override
    public ObjectForBigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject object = json.getAsJsonObject();
        String string = object.get("money_amount").getAsString().replace(",", ".");
        BigDecimal bd = new BigDecimal(Double.valueOf(string));
        return new ObjectForBigDecimal(bd);
    }
}
