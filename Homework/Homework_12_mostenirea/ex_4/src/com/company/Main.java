package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle tr = new Triangle();
        Circle c = new Circle();
        Rectangle rec = new Rectangle();

        System.out.println(tr.area(7,9));
        System.out.println(c.area(8));
        System.out.println(rec.area(9,2));
    }
}
