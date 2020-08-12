package com.company;

public class Triangle extends Polygon {
    Point cornerOne;
    Point cornerTwo;
    Point cornerThree;

    Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        this.cornerThree = cornerThree;
    }

    public String toString() {
        return "cornerOne " + cornerOne + " cornerTwo " + cornerTwo + "cornerThree" + cornerThree;
    }

    @Override
    public void moveUp(int distance){
        distance += cornerOne.getX()+cornerTwo.getX()+cornerThree.getX();
        distance += cornerOne.getY()+cornerTwo.getY()+cornerThree.getY();
    }
    @Override
    public void moveDown(int distance){
        distance += cornerOne.getX()+cornerTwo.getX()+cornerThree.getX();
        distance += cornerOne.getY()+cornerTwo.getY()+cornerThree.getY();
    }
    @Override
    public void moveLeft(int distance){
        distance += cornerOne.getX()+cornerTwo.getX()+cornerThree.getX();
        distance += cornerOne.getY()+cornerTwo.getY()+cornerThree.getY();
    }
    @Override
    public void moveRigth(int distance){
        distance += cornerOne.getX()+cornerTwo.getX()+cornerThree.getX();
        distance += cornerOne.getY()+cornerTwo.getY()+cornerThree.getY();
    }
}
