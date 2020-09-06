package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        
        int day = sc.nextInt();
        int minutes = sc.nextInt();

        LocalDateTime dateTime = LocalDateTime.parse(date);

        System.out.println(dateTime.plusDays(day).minusHours(minutes));


    }
}
