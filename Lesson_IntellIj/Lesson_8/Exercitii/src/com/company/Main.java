package com.company;

public class Main {

    public static void main(String[] args) {
     numere(12,15);
     numere(17,18);

    }
    public static void numere(int ...num) {
        int result = 0;
        for (int x : num)
            result += x;
        System.out.println(result);
    }



}
