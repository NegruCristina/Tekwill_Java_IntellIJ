package com.company;

public class Circle implements Movable {
    Point point;
    int radius;

    Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public String toString() {
        return "point " + point + " radius " + radius;
    }


    @Override
    public void moveUp(int distance) {
        distance += point.getX() + point.getY();
    }

    @Override
    public void moveDown(int distance) {
        distance += point.getX() + point.getY();
    }

    @Override
    public void moveLeft(int distance) {
        distance += point.getX() + point.getY();
    }

    @Override
    public void moveRigth(int distance) {
        distance += point.getX() + point.getY();
    }
}
