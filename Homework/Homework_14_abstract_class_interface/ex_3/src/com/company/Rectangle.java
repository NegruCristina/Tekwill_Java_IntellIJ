package com.company;

public class Rectangle extends Shape {
    protected double l;
    protected double L;

    public Rectangle(double l, double L) {
        this.l = l;
        this.L = L;
    }

    @Override
    public double getPerimeter() {
        return l + L;
    }

    @Override
    public double getArea() {
        return l * L;
    }

    @Override
    public String toString() {
        return "A rectangle has two different side l= " + l + ", L= " + L + " Perimeter= " + getPerimeter() + "," + " area= " + getArea() + ".";
    }
}
