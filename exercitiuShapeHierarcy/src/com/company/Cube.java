package com.company;

public class Cube implements ThreeDimensionalShape {
    double L;

    Cube(double L) {
        this.L = L;
    }

    public double getL() {
        return L;
    }

    public double getArea() {
        return 6 * L * L;
    }

    public double getVolume() {
        return Math.pow(L, 3);
    }
}
