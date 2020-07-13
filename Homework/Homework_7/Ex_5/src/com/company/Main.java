package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word1 = sc.nextLine();


        int count = 0;
//numaram de cite ori cuvintul word1 se contine in cuvintul word
        for (int i = 0; i < word1.length(); i++) {
            //verificam daca word1 se contine in word
            if (word1.contains(word)){
                //daca se indeplineste conditia se incrementeza
                count++;
            }
        }
        System.out.println(count);
    }
}
//nu merge rezultatul