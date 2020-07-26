package com.company;

public class Cats {

    String name;
    boolean sleeping;//slleping este false by default

    public void say() {
        if (sleeping) {
            System.out.println("zzz");
        } else {
            System.out.println("meow");//primul raspuns o sa fie meow ca sleeping este false
        }
        if (Math.random() > 0.5) {
            //sleeping se transforma in true si apoi se afiseaza zzz
            sleeping = true;
        }
    }

    public void wakeUp() {
        sleeping = false;
    }
}
