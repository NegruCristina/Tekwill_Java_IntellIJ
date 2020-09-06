package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //initializam un aray
        int[] n = new int[num];
        //incepem sa numaram cite elemente va avea aray
        for (int i = 0; i < num; i++) {
            //adaugam elementele de la tastura a aray-ului
            n[i] = scanner.nextInt();
        }
        //pastram o variabila pentru a putea numara cite elemente are o rotatie
        int s=1;
        //pastram urmatoarea variabila
        int tempS=1;
        //treceme prin tot aray adaugat mai sus
        for(int i=0; i<n.length; i++){
            if(n[i]>n[i-1]){
                tempS++;
            }
         //facem comparatie intre aceste 2 elemente, daca se indeplineste conditia se trce la urmatorul cerc din for
         if(tempS<s){

            //daca se indeplineste conditia de m-ai sus la variabila pastrata pentru a numara toate elementele,
             // incrementam
             s++;
             
         }
         else if(n[i]<=n[i-1]){
                 tempS=1;
            }

                 }


        System.out.println(s);
    }
}
