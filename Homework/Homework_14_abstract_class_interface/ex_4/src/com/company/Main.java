package com.company;

public class Main {

    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f,3.5f,10.1f);
        circle.move(10.1f, 20.1f);
        circle.scale(2.2f);
//deoarece nu avem metoda geTradis in mutableshape noi facem Cast la acest obiect circle
        ((Circle) circle).getRadius();

        
    }
}
