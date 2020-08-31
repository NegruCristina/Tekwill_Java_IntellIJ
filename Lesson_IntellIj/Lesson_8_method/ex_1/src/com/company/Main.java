package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        long result=sumInRange(a,b);
        System.out.println(result);
    }
    public static int sumInRange(int a, int b){
        int sum=0;
      for(int i=a;i<b;i++){
          sum+=i;

      }
return sum;
    }
}
