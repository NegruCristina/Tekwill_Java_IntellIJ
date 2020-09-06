package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//media aritmetica la cifrele care se / la 3, dintr-un interval
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //dam intervalul
        int a = sc.nextInt();
        int b = sc.nextInt();


        int sum = 0;
        double count = 0;
/*prima cifra din ciclu va fi aceea care noi o dam si se va verifica pina la ultima cifra pe care noi o dam
      facem verificarea daca se imparte la 3 atunci aceasta cifra o adaugam la suma noastra si o pastram in count  */
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
            //facem media aritmetica suma tuturor numerelor
            // gasite care se imparte la3 se face sum si dupa ce a numarat cite
            // numere a gasit impartem la numarul acesta
            System.out.println(sum / count);
        }

    }
}
