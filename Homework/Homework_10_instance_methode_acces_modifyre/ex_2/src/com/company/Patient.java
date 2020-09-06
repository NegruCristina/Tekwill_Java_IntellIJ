package com.company;

public class Patient {
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void say(String name) {
        System.out.println("Hello, my name is " + name + ", I need doctor");
    }
}
