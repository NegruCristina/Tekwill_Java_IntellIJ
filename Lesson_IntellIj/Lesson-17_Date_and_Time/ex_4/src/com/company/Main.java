package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        LocalDateTime localDateTime = LocalDateTime.parse(num);
        for (int i = 0; i < num; i++) {
            System.out.println(localDateTime.MAX);
        }
    }
}
