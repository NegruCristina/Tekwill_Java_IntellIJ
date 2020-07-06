package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("ex.1");
        int A = 7, B = 10, H = 9;

        if (A <= B) {
            System.out.println("Normal");
        } else if (B >= H) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }






        System.out.println("ex.2");
        int i = 5;
        if (i < 1) {
            System.out.println("no army");
        } else if (i > 1 && i < 19) {
            System.out.println("pack");
        } else if (i >= 20 && i <= 249) {
            System.out.println("throng");
        } else if (i >= 250 && i <= 999) {
            System.out.println("zounds");
        } else if (i >= 1000) {
            System.out.println("legion");

        }
        System.out.println("ex.3");
        System.out.println("ex.4");
        String s = "gryffindor";
        if (s == "gryffindor") {
            System.out.println("BRAVERYY");
        } else if (s == "hulflepuff") {
            System.out.println("loyalty");
        } else if (s == "slytherin") {
            System.out.println("cunning");
        } else if (s == "ravenclaw") {
            System.out.println("intelect");
        } else {
            System.out.println("not a valid case");
        }
        String s1 = "move ";
        int i1 = sc.nextInt();
        switch (i1) {
            case 1:
                s1+="up";
                break;
            case 2:
                s1+="down";
                break;
            case 3:
                s1+="left";
                break;
            case 4:
                s1+="right";
                break;
            default:
                s1 = "do not move";

        }
        System.out.println(s1);


        System.out.println("ex5.");



        

        System.out.println("ex.6");
        int q=8;
        if ( q %3 ==0){
            System.out.println("Fizz");
        } else if (q%5==0){
            System.out.println("Buzz");
        } else if (q/5 ==0 && q/3==0){
            System.out.println("FizzBuzz");
        }

        System.out.println("ex.7");



        System.out.println("ex.8");

        int p;
      do{
          p=sc.nextInt();
          System.out.println(p);
      }while (p!=0);


        System.out.println("ex.9");


        int N=0, M=1;
        while(N>50){
            System.out.println(N);
            M++;
            N+=M;
            }
    }
}
