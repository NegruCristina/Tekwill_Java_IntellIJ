package com.company;

public class Main {

    public static void main(String[] args) {
        //am apelat metoda din interfata Runnable prin clasa nou creata
        Runnable creat = Create.createRunnable("hello!", 5);
        creat.run();

    }
}
