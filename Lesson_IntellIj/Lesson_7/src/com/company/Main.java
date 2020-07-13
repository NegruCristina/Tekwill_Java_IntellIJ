package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
Scanner scaner =new Scanner(System.in);

/*
// asa se adauga un string gol
        String emptyString = "";
        System.out.println(emptyString);


//aici programul intoarce invers stringul
        String cr = "Cristina";
        for (int i = cr.length()-1; i >= 0; i--) {
            System.out.print(cr.charAt(i));
        }

        String el="Elena";
        for(int i=el.length()-1; i>=0; i--){
            System.out.print(el.charAt(i));
        }

        String m="Mihai";
        for(int i=m.length()-1; i>=0;i--){
            System.out.print(m.charAt(i));
        }
        System.out.println();
//ex.1 introducem un cuvint de la tastatura si cu ajutoru la subsstring intoarcem doar o buca de cuvint in
        //dependenta de cite indexuri scrie primil index este in num si pina unde se ne arate cuvintul in num2
        String sc=scaner.nextLine();
        int num=scaner.nextInt();
        int num2=scaner.nextInt();

        System.out.println(sc.substring(num,num2+1));


//dintr-un cuvint putem il face ca un array
        String text ="Hello";
        String[] aray =text.split("");
        System.out.println(Arrays.toString(aray));


//si o propozitie tot o transforma in aray
      String sentece="Java is interesting";
      String[] array=sentece.split(" ");//daca nu punem interval intre "" atunci ne intoarce aray pe litere
                                              //fiecare lidera espartita prin vigula
        System.out.println(Arrays.toString(array));

//a parcurs tot stringul pe litere aparte
        String name="Isaac Newton";
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i) + " ");
        }*/
     //ex.2 trebuie sa alegem cuvintul cel mai lung


        String str = scaner.nextLine();
        //aici se introduce in aray pentru comparatie
        String[] strArray = str.split(" ");
        //aici pastram un string din aray care se va incepe de la 0
        String biggestWord = strArray[0];
        //trecem prin fiecare numar ne uitam lungimea la fiecare numar
        for(int i = 1; i < strArray.length; i++) {
            //aici facem comparatie dintre elementul 0 adica(1-1) si urmatorul element ce lungime au, daca sunt diferite se duce iarasi si mai face o
            // iteratie in for
            if(strArray[i-1].length() < strArray[i].length())  {
                //aici pastram rezultatul in stringul creat m-ai sus din sirul aray dupa ce se face comparatie intre cuvinte
                biggestWord = strArray[i];
            }
        }

        System.out.println(biggestWord);
    }
    }
