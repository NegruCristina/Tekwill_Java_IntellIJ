package com.company;

public class Main {

    public static void main(String[] args) {

        Cats pharaon = new Cats();
        pharaon.name = "pharaon";
        /*se trece de 5 ori prin class prima data este meow, apoi cit timp sleeping este true se intoarce zzz,
        apoi i = 5 si nu se indeplineste conditia si se trece in sleeping in true conform conditie din metoda say*/
        for (int i = 0; i < 5; i++) {
            pharaon.say();
        }
        pharaon.wakeUp();
        pharaon.say();
    }
}
