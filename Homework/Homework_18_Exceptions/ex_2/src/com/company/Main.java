package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(Converter.convertStringToDouble(num));
    }

    public static class Converter {

        public static double convertStringToDouble(String input) {
            try {
                return Double.parseDouble(input);
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
