package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word =sc.nextLine();
        String word1=sc.nextLine();
        
        int count=0;
        int count1=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==word1.charAt(count1)){
                count1++;
                if(count1==word1.length()){
                    count++;
                    count1=0;
                }

            }
            else {
                count++;
            }
        }
        System.out.printf("Al doilea cuvint se repeta in primul cuvint de %d ori",count);
    }
}
