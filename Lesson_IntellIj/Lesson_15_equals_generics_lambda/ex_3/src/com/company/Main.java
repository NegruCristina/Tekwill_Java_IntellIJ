package com.company;

import java.util.function.LongUnaryOperator;

public class Main {


    public static LongUnaryOperator unaryOperator = x -> (x % 2 == 0) ? x + 2 : x + 1;

    public static void main(String[] args) {
        System.out.println(unaryOperator.applyAsLong(1));
        System.out.println(unaryOperator.applyAsLong(3));
        System.out.println(unaryOperator.applyAsLong(107));

    }


}