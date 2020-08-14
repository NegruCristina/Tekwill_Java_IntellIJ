package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double[] arr = {a};
        Arrays.asList(arr, b);

        for (int i = 0; i < arr.length; i++) {
            double result = 0;
            double result1 = 0;
            if (arr[i] % 3 == 0) {
                result = arr[i];
            }
            result1 += result;
            System.out.println(result1 / 3);
        }

    }
}
