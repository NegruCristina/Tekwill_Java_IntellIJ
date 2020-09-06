package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());

    }
}
