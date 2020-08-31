
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
          String name=scanner.nextLine();
        System.out.println("Now,your age please");
        int age =scanner.nextInt();
        System.out.println("hi, mye nam is "+ name + "!");
        System.out.println("i`s "+ age + "years old");

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(((n+1)*n+2)*n+3);
        Scanner scc =new Scanner(System.in);
double m=scc.nextDouble();
        System.out.println(Math.pow(m, 3)+m+1);

      Scanner s= new Scanner(System.in);
      int x=s.nextInt();
      int z=s.nextInt();
      int q=s.nextInt();
        System.out.println(z+x==20 || x+q==20 || z+q==20  );


    }
}
