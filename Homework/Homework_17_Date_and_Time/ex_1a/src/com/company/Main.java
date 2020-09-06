package com.company;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        LocalDate dataPlus = LocalDate.parse(data).plusYears(30);
        LocalDate dataMinus =LocalDate.parse(data).minusYears(30);
        System.out.println(dataMinus);
        System.out.println(dataPlus);

        System.out.println(dataMinus.compareTo(dataPlus));
    }
}
