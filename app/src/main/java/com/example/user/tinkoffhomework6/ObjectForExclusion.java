package com.example.user.tinkoffhomework6;

/**
 * Created by User on 06.11.2017.
 */

public class ObjectForExclusion {

    private String firstString;
    private String secondString;
    private int firstInt;

    ObjectForExclusion(String firstString, String secondString, int firstInt) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.firstInt = firstInt;

    }

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public int getFirstInt() {
        return firstInt;
    }

    public void setFirstInt(int firstInt) {
        this.firstInt = firstInt;
    }
}
