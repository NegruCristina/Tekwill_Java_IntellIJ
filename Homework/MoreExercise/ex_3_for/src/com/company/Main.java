package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 5;
        int B = 4;
        int C = 3;
        int D = 2;
        int[] arr = new int[n];
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                A++;
            } else if (arr[i] > arr[i + 1]) {
                B++;
            } else if (arr[i] > arr[i + 1]) {
                C++;
            } else
                D++;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
