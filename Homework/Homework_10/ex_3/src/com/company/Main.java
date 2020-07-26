package com.company;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock(12,58);
        System.out.println(clock.clock());
        clock.next();

    }
}
