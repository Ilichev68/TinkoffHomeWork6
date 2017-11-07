package com.example.user.tinkoffhomework6;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;


/**
 * Created by User on 07.11.2017.
 */

public class ConverterForDate implements JsonSerializer<DateExample> {
    @Override
    public JsonElement serialize(DateExample src, Type typeOfSrc, JsonSerializationContext context) {

        JsonObject object = new JsonObject();
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        object.addProperty("date", newDateFormat.format(src.getDate().getTime()));
        return object;
    }
}
