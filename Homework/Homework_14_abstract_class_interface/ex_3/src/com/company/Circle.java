package com.company;

public class Circle extends Shape {
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "A circle has a radius= " + r + " perimeter= " + getPerimeter() + ", area= " + getArea() + ".";
    }
}
