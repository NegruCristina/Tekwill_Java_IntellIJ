package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Converter.convertStringToDouble(num);
    }

    public static class Converter {

        public static double convertStringToDouble(String input) {
            try {
                System.out.println(Double.parseDouble(input));
            } catch (Exception e) {
                System.out.println(0);
            }
            return 0;

        }
    }
}
