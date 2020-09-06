package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        LocalDate date = LocalDate.parse(data);
        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}
