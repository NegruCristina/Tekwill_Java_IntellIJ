package com.company;

import java.util.Scanner;

public class Main {
//verificam care este cel m-ai mic numar la care se face factorialul
// numar este:6188989133 care se da de la tastatura
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number=sc.nextLong();//6188989133
        //initializam 2 variabile care ne ajuta sa calculam factorial
        long n = 1;
        int m= 1;
//punem onditia ca produsul lui n sa nu fie m-ai mare decit numarul dat de la tastatura
        while (n <= number) {
            //aici se increeteaza fiecare numar apoi se inmulteste cu valoarea initiala pina ajunge sa fie
            //m-ai mare decit numarul dat de la tastatura se iese din conditie
            m++;
            //1*2*3*4*5*6*7*8*9*10*11*12*13 si aici se opreste pentru ca nu indeplineste conditia
            n *= m;
        }
        System.out.println(m);

    }
}
