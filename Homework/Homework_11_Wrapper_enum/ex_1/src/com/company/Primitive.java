package com.company;


public class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if (b == null) {
            return false;
        }
        return b.booleanValue() ? true : false;
    }

}
