package com.company;

public class Main {

    public static void main(String[] args) {
        Calculateble c = new Calculation();
//        System.out.println(c.suma(4, 5));

Printable printable=createPrintable("Negru Cristina", true);
printable.print();

read(new Book("Java for impatients", "Cay Horstmann"));
read(new Journale("Java dayly news"));

    }

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option)
            return new Book(name, "Undefinied");
        else
            return new Journale(name);
    }
}
