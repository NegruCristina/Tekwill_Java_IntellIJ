package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Cake> appleBox = new Box<>();
        appleBox.put(new Cake());

        Box<Pie> strawberryPie = new Box<>();
        strawberryPie.put(new Pie());

        Box<Tart> cherry = new Box<>();
        cherry.put(new Tart());
    }
}
