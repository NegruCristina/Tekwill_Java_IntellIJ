package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //intialiaza vriabilele
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

       //initializam o variabila care apoi va fi folosita pentru a numara in intervalul pina la 1000 de cite ori aceasta ecuatie nu este 0
        int count =0;
        for(int x=0; x<1000; x++){
            long l=a*(long)Math.pow(x,3)+b*x*x+c*x+d;
            //vedem daca ecuatia este 0 atunci printam x
            if(l==0){
                System.out.println(x);
                //numaram de cite ori sa facut aceasta ecuatie
                count++;
                //micsoram conditia, daca de 2 ori s-a gasit rezolvarea acestei probleme atunci finisam problema
                if(count==3){
                    break;
                }
            }
        }
    }
}
