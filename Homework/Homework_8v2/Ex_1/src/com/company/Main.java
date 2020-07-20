package com.company;

import java.util.Scanner;

public class Main {
public static void printReverseCharByChar(String s){
    //am facut un string nou pe baza la StringBuilder la stringul existent s si l-am inversat ca un string
 String reverse=new StringBuilder(s).reverse().toString();
    System.out.println(reverse);
//    if ((s.length()>0)){
//       int last=s.length()-1;
//       printReverseCharByChar(s.substring(0, last));
//       System.out.print(s.charAt(last));

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printReverseCharByChar(sc.nextLine());
    }
}
