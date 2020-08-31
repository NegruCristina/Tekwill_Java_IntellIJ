package com.company;

public class Box {
    double height;
    double width;
    double length;

    public Box(double height) {
        this.height = height;
    }

    public Box(double height, double width, double length) {
    this.height = height;
    this.width = width;
    this.length = length;
}
    public double getVolume(){
        return height * length * width;
    }


}
