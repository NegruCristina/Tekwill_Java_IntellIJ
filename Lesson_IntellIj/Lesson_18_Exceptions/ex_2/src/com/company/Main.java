package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int i = Integer.parseInt(sc.next());
       try{
           System.out.println(s[i]);
       }catch (ArrayIndexOutOfBoundsException a) {
           System.out.println("This array have 5 index");
       }

    }
}