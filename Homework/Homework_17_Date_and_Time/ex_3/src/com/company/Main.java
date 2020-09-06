package com.company;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int day=sc.nextInt();

       LocalDate date= LocalDate.ofYearDay(year, day);
        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
    }



}
