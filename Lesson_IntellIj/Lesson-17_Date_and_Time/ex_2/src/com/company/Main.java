package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
Long hour=Long.valueOf(scanner.nextLine());

        LocalTime ora=LocalTime.ofSecondOfDay(hour);
        System.out.println(ora);

//        LocalDateTime ora=LocalDateTime.now();
//        System.out.println(ora);

    }
}
