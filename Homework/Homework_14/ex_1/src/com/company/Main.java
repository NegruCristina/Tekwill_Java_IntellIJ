package com.company;

public class Main {

    public static void main(String[] args) {
        IntBinaryOperation ad = new Addition(7, 9);
        System.out.println(ad.perform());
        IntBinaryOperation m = new Multipliction(7, 9);
        System.out.println(m.perform());
    }
}
