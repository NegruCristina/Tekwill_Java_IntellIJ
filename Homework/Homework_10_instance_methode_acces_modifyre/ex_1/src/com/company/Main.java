package com.company;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        counter.inc();
        counter.inc();
        System.out.println(counter.getCurrent());
        counter.inc();
        counter.inc();
        System.out.println(counter.getCurrent());
    }
}
