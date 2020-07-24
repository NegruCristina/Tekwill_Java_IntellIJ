package com.company;


public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //indicam cit va fi aray-ul
        int size = 10;
      //  initializam aray in dependenta de marimea data
        int[] aray = new int[size];
//trecem prin toate elementele aray
        for(int i = 0; i < size; i++){
            aray[i]=sc.nextInt();
      }
        //adaugam inca o valoare
        int value = sc.nextInt();
        //sortam aray-ul, ca in asa caz nu va lucra aray-ul nostru
        java.util.Arrays.sort(aray);
        //index-ul ne arata in ce loc in aray este valoarea care data de la consola
        int index = java.util.Arrays.binarySearch(aray, value);
           System.out.println(index);

        }
}
