package com.company;

public class Rectangle extends Polygon {
    Point topRightCorner;
    int width;
    int hight;


    Rectangle(Point topRightCorner, int width, int hight) {
        this.topRightCorner = topRightCorner;
        this.width = width;
        this.hight = hight;
    }

    public String toString() {
        return "topRightCorner " + topRightCorner + " width " + width + "  hight " + hight;
    }

    @Override
    public void moveUp(int distance) {
        distance += topRightCorner.getX();
        distance += topRightCorner.getY();
    }

    @Override
    public void moveDown(int distance) {
        distance += topRightCorner.getX();
        distance += topRightCorner.getY();
    }

    @Override
    public void moveLeft(int distance) {
        distance += topRightCorner.getX();
        distance += topRightCorner.getY();
    }

    @Override
    public void moveRigth(int distance) {
        distance += topRightCorner.getX();
        distance += topRightCorner.getY();
    }
}
