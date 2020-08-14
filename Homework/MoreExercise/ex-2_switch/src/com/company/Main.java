package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int Java = 1;
        int Kotlin = 2;
        int Scala = 3;
        int Python = 4;

        switch (i) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknwon number");
        }
    }
}
