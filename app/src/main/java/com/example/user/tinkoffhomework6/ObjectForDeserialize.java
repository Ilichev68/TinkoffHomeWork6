package com.example.user.tinkoffhomework6;

import java.util.HashMap;

/**
 * Created by User on 06.11.2017.
 */

public class ObjectForDeserialize {

    private String name;
    private HashMap any_map;

    public ObjectForDeserialize(String name, HashMap any_map) {
        this.name = name;
        this.any_map = any_map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap getAny_map() {
        return any_map;
    }

    public void setAny_map(HashMap any_map) {
        this.any_map = any_map;
    }
}
