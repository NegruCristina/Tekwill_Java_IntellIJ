package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
//in acest string o sa pastram prima litera din cuvintul nostru word
        String res=String.valueOf(word.charAt(0));
        int count=1;
        for (int i=1; i<word.length();i++){
            //o sa comparam daca 1 litera este egala cu a 2
            if(word.charAt(i-1)==word.charAt(i)){
                //o sa incrementam daca ele o sa fie egale
                count++;
            }
            /*o sa trecem la urmatoarea litera din cuvint cind litera precendent nu va fi egala cu cea curenta
            dar o sa partam si rezultatul precedent prin res+count*/
            else {
                res+=count+String.valueOf(word.charAt(i));
                //dupa ce va trece la urmatoarea litera count se transforma in 1
                count=1;
            }
        }
        res+=count;
        System.out.printf("Rezultatul este %s",res);
    }
}
