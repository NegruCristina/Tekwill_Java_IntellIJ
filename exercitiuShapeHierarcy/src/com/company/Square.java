package com.company;

public class Square implements TwoDimensionalShape{
    double l;

    Square(double l){
        this.l=l;
    }
    public double getL(){
        return l;
    }
    public double getArea(){
        return l*l;
    }
    public double getPerimeter(){
        return l+l;
    }
}
