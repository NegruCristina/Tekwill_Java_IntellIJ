package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(extractInt(d));
    }
    public static int extractInt(double d){
return (int) Math.floor(d);

    }


}
