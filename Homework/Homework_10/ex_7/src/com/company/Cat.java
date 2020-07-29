package com.company;

public class Cat {
    String name;
    int age;
    static int counter=5;

    public Cat(String name, int age){
        this.name=name;
        this.age=age;
        counter++;
    }
    public static int getNumberCats(){

        if(counter>5) {
            System.out.println("You are have too many cats");
        }

        return counter;
}
    }

