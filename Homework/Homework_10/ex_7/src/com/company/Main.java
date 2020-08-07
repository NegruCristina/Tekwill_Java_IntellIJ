package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat1=new Cat("Persic",2);
        System.out.println("My name is "  +  cat1.toString()+ ", and it have " + " years");
        System.out.println(Cat.getNumberCats());
    }
}
