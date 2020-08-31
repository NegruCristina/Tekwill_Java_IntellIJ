package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2017, 06, 03);
//        LocalDate date1 = LocalDate.of(2017, 04, 28);
//        LocalDate tenAgo = date.minusDays(10);
//        LocalDate tenAgo1=date1.minusDays(10);
//
//        System.out.println(tenAgo);
//        System.out.println(tenAgo1);
        Scanner sc=new Scanner(System.in);
        String date1=sc.nextLine();
        LocalDate date=LocalDate.parse(date1).minusDays(10);
        System.out.println(date);
    }
}
