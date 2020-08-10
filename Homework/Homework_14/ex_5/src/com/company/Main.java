package com.company;

public class Main {

    public static void main(String[] args) {
        Runnable create = new Create("hello",3);
        create.run();

    }
}
