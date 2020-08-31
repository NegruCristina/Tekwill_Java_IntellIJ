package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int i = Integer.parseInt(sc.next());
        if(i>s.length||i<0){
            System.out.println("This array have 5 index");
        }else {
            System.out.println(s[i]);
        }
    }
}

