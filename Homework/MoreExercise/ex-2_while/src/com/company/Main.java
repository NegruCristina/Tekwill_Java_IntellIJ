package com.company;

import java.util.Scanner;

public class Main {
//daca nr. este impar se *3+1, daca este par se imparte la 2, conditia cind este 1 sa iasa din program
//acest program poate merge la infinit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 1) {
            n = n % 2 == 0 ? (n / 2) : (n * 3 + 1);
        }
        System.out.println(" " + n);
    }


}
