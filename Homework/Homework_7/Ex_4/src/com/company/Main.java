package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String data=sc.nextLine();
	String data1=sc.nextLine();

	System.out.println(data.replace(data, data1));

	/*solutie din internet
		Date data=new Date();
		String Date=sc.nextLine();
		DateFormat date=new SimpleDateFormat("dd/MM/YYYY");
		String finalDate=date.format(data);
		System.out.println(finalDate);*/
    }
}
