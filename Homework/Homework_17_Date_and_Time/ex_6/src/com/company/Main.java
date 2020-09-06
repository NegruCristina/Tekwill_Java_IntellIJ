package com.company;

import java.security.acl.LastOwnerException;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstHour=sc.nextLine();
        String secondHour=sc.nextLine();

        LocalTime first=LocalTime.parse(firstHour);
        LocalTime second=LocalTime.parse(secondHour);
        int sec=second.toSecondOfDay()-first.toSecondOfDay();
        System.out.println(Math.abs(sec));


    }
}
