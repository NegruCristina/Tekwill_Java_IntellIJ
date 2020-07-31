package com.company;

public class Main {

    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        DangerLevel low = DangerLevel.LOW;
        System.out.println(high.getLevel() > medium.getLevel());
        System.out.println(high.getLevel() < low.getLevel());
    }
}
