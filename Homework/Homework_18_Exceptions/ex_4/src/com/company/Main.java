package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num =new String[]{sc.next()};

        try {
            int result = Integer.parseInt(Arrays.toString(num));
            result = result * 10;

//            if(num.equals(0)){
//
//            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.printf("Invalid user input: %s%n",  Arrays.toString(num));
        }

    }
}
