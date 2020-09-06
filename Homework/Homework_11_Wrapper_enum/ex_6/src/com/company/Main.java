package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), p, S;
        p = (a + b + c) / 2;
       S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);
        System.out.println(p);
    }
}
