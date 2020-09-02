package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double sqrt(double x) throws IllegalArgumentException{
        throw new IllegalArgumentException("Expected non-negative number, got ?"+ " IllegalArgumentException");
    }
}
