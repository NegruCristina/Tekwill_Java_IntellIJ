package com.company;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.inc(5);
        System.out.println(counter.getCurrent());
    }
}
