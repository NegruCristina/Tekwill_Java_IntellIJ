package com.company;

import java.util.function.IntBinaryOperator;

public class Main {
    public static IntBinaryOperator binaryOperator = (x, y) -> Math.max(x, y);
    public static void main(String[] args) {

        System.out.println(binaryOperator.applyAsInt(4, 3));

    }
}
