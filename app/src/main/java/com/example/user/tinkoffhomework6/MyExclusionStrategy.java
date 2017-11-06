package com.example.user.tinkoffhomework6;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 * Created by User on 06.11.2017.
 */

public class MyExclusionStrategy implements ExclusionStrategy {


    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        return (f.getDeclaringClass() == ObjectForExclusion.class && f.getName().equals("secondString"));
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}
