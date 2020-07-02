package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.println("ex1.");
        Scanner ex_1 =new Scanner(System.in);
        int m=ex_1.nextInt();
        int n=ex_1.nextInt();
        int c=ex_1.nextInt();
        int d=ex_1.nextInt();
       System.out.println(m);
       System.out.println(n);
       System.out.println(c);
       System.out.println(d);


       System.out.println("ex2.");
        Scanner ex_2 =new Scanner(System.in);
        int e=ex_2.nextInt();
        System.out.println(e+1);
        int f=ex_2.nextInt();
       System.out.println(f-10);


       System.out.println("ex3.");
       // Scanner ex_3=new Scanner(System.in);
       // int g=ex_3.nextInt();
        //int l=ex_3.nextInt();
       // int i=ex_3.nextInt();
       // int j=ex_3.nextInt();
        //int k=ex_3.nextInt();
       // System.out.println((g+l+i)/(j-k));//(100+100+276)/(128-100)


        System.out.println("ex4");
       int a=3, b=2, h=10;
        System.out.println(a++ - b  + --a -b +a++ -b + --a -b +a++ -b + --a -b +a++ -b+ --a);


        System.out.println("ex5.");
        Scanner ex_5=new Scanner(System.in);
        double r=ex_5.nextDouble();
        System.out.println(r/2);


     //System.out.println("ex6.");
     //Scanner ex_6 =new Scanner(System.in);
     //double s=ex_6.nextDouble();
     //double t=ex_6.nextDouble();
     //System.out.println(-(s-(t)));


        System.out.println("ex7.");
        int q =0;
        boolean result =q<0 && q>10;
        System.out.println(result);
    }
}
