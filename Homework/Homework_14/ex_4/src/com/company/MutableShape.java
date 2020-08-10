package com.company;

public interface MutableShape extends Movable, Scalable{
    void move(float dx, float dy);
    void scale(float factor);
}
