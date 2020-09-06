package com.company;

public class Triangle extends Shape {
    protected double a;
    protected double b;
    protected double c;
    protected double p;
    protected double S;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return p = (a + b + c)/2;
    }

    @Override
    public double getArea() {
        return S = Math.cbrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "A triangle has three sides a=" + a + ", " + "b= " + b + "," + " c=" + c + "," + " perimeter= " + getPerimeter() + "," + " area= " + getArea() + ".";
    }
}
