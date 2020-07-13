package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);

int matrix =scanner.nextInt();
//am initializat aray
int[][]cub =new int[matrix][matrix];

//incepem sa adaugam rindurile si coloanele la matrita noastra,i adauga coloanele si j cite rinduri va avea
for(int i=0; i<matrix;i++){
    for(int j=0; j<matrix;j++){
   //
        int x=j-i;
        //aici punem conditia ca x nu trebuie sa fie mai mic ca 0
        x=x> 0 ? x : -x;
        //aici formam aray bidimesional
        cub[i][j]=x;
    }
}
for(int[] ints:cub){
    for(int i:ints){
        System.out.print(i+ "");
    }
    System.out.println();
}

    }
}
