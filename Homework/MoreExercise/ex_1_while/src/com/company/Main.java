package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        int n = 1;

        while (n < m) {
            n++;
            n *= m;
        }
        System.out.println(n);

    }
}
