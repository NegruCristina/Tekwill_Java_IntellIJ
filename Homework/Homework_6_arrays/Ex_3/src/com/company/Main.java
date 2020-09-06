package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] n = new int[len];
        for (int i = 0; i < len; i++) {
            n[i] = sc.nextInt();
        }

        int l = sc.nextInt();
        int sum = 0;
        for (int c: n){
            if (c>l){
                sum+=c;
            }
        }
        System.out.println(sum);
    }
}
