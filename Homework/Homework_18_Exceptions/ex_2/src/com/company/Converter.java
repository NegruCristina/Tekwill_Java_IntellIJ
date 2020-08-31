package com.company;

public class Converter {

    public static double convertStringToDouble(String input) {
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            System.out.println(0);
        }
        return Double.parseDouble(input);

    }
}

