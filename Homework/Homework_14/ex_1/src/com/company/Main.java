package com.company;

public class Main {

    public static void main(String[] args) {
        Addition ad = new Addition(7, 9);
        System.out.println(ad.perform());
        Multipliction m = new Multipliction(7, 9);
        System.out.println(m.perform());
    }
}
