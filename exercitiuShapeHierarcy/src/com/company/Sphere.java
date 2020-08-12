package com.company;

public class Sphere implements ThreeDimensionalShape{
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
}
