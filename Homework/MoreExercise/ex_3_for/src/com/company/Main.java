package com.company;

import java.util.Scanner;

public class Main {
//aflam suma notelor de acelasi fel la o evaluare cu 4 calificative
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initializam citi elevi sunt in grup
        int n = sc.nextInt();
//facem un array care permite doar 4 cafilificative
        int[] arr = new int[4];
        //trecem prin fiecare nota la fiecare elev
        for (int i = 0; i < n; i++) {
            //aici punem sirul de note la n elevi
            int a = sc.nextInt();
            //aici ne arata de pe care pozotie a array sa incepe a numara,
            // se scade 2 ca cea mai mica nota este 2 care se afla cu index 0
            arr[a - 2]++;
        }
        for (int grade : arr) {
            System.out.println(grade + " ");

        }


    }
}
