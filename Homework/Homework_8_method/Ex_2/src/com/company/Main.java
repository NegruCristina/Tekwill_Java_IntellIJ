package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
/*am definit o variabila boolean cu false, insa daca are una din variantele din switch atunci este true
    metoda verifica daca valoarea c este in case din switch*/
    public static boolean isVowel(char c) {

        boolean isVowel=false;
       switch (String.valueOf(c).toLowerCase()) {
           case "a":
               isVowel=true;
               break;
           case "e":
               isVowel=true;
               break;
           case "o":
               isVowel=true;
               break;
           case "i":
               isVowel=true;
               break;
           case "u":
               isVowel=true;
               break;
       }
return isVowel;

    }
}


