package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int ir=sc.nextInt();
        print(str);
        print(str,ir);

    }
    public static void print(String str){
        System.out.println("print(\""+ str+"\")");
    }
    public static void print(int ir){
            System.out.println("print(\0"+ir+"\")");
        }

}
