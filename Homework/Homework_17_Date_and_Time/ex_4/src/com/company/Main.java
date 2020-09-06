package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();

        LocalTime hour=LocalTime.parse(time);
        System.out.println(hour.withSecond(0));
    }
}
