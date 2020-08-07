package com.company;

import java.util.Arrays;

public class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhd() {
        return true;
    }

    public String[] getMethods() {
        return methods;
    }

    public String toString() {
        return name + " " + email + " " + experience + " " + phd + " " + Arrays.toString(methods);
    }
}
