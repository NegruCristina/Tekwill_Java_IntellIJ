package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        String[] dateAray=date.split("-");

        String finalDate=String.format("%s/%s/%s",dateAray[1], dateAray[2],dateAray[0]);
        System.out.println(finalDate);
    }
}
