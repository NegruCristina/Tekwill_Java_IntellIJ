package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        int day = sc.nextInt();

        LocalDate localDate = LocalDate.parse(date);
        //am creat o noua data care se inlocuieste ziua si luna
        LocalDate newYear = localDate.withMonth(12).withDayOfMonth(31);
        //am creat inca o data unde adaugam zilele cerute din cerinta
        LocalDate finalDate = localDate.plusDays(day);
        //facem comparatie daca ultima data este dupa prima data
        System.out.println(finalDate.isAfter(newYear));

    }
}
