package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc  =new Scanner(System.in);
String date=sc.nextLine();
        LocalDateTime dateTime=LocalDateTime.parse(date).plusHours(11);
        LocalDate localDate=dateTime.toLocalDate();
        System.out.println(localDate);

    }
}
