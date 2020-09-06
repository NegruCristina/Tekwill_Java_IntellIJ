package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        int minutes = sc.nextInt();
        LocalDateTime dateTime = LocalDateTime.parse(date).plusMinutes(minutes);

        System.out.println(dateTime.getYear() + " " + dateTime.getDayOfYear() + " " + dateTime.toLocalTime());


    }
}
