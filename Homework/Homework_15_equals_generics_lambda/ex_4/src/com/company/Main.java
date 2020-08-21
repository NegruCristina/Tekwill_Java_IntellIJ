package com.company;

import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
       Double result= Operator.unaryOperator.applyAsDouble(4.4);
        System.out.println(result);
    }
   static class Operator {
        public static int a = 10;
        public static int b = 20;
        public static int c = 30;

        public static DoubleUnaryOperator unaryOperator = (x) -> (a * x * x + b * x + c);
    }
}
