package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	String word2=sc.nextLine();
	//elimina spatiile libere dintre cuvinte
	String finalWord=word.replace(" ", "");
	String finalWord2=word2.replace(" ","");

		System.out.println(finalWord.equals(finalWord2));
	}
    }

