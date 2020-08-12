package com.company;

import sun.awt.windows.ThemeReader;

public class Tetrahedron implements ThreeDimensionalShape{
    double lenght;

    Tetrahedron(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea() {
        return Math.sqrt(3.0) * lenght * lenght;
    }

    public double getVolume() {
        return Math.pow(lenght, 3) / 6 * Math.sqrt(2.0);
    }
}

