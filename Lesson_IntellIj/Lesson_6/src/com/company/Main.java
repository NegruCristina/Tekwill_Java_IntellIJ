package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        int max = 1;
/*while (i!=0){
    if (i>max){
        max=i;
    }
    i=scan.nextInt();
}
        System.out.println(max);
*/
do{
    max=scan.nextInt();
}while(i!=0);
        System.out.println(max);

        /*
        System.out.println("ex.2");

        int s=scan.nextInt();
        int max1=1000;
        while(s!=0){
            if (s>max1){
               s-=1000;
            }
        }

        int g=1;
        int h=-4;
        String z= g>h?"Yes":"No";
        System.out.println(z);

         */
    }
}
