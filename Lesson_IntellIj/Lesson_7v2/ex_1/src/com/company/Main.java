package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
String[] fullName=name.split(" ")
	StringBuilder word=new StringBuilder();
      for (String surname:fullName){
          word.append(surname.charAt(0))

      }
        System.out.println(word.toString());
    }
}
