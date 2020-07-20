package com.company;

import java.util.Scanner;

public class Main {
public static int sum(int s) {
    if (s < = 1) {
        return s;
    }
    return s + sum(s - 1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sum(sc.nextInt());
        System.out.println(sum);
    }
}
