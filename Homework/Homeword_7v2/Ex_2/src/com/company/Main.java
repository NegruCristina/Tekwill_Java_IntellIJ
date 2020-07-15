package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        String[] dateAray=date.split("-");
        String bara="/";
        String bara1="/";
        String bara2="/";
        String finalDate=dateAray[1]+String.format("%s",bara)+ dateAray[2] +String.format("%s",bara1) +dateAray[0] +String.format("%s",bara2);
       s System.out.println(finalDate);
    }
}
