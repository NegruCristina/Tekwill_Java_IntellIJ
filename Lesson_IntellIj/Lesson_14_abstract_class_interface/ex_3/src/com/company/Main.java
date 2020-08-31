package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                StringBuilder sb = new StringBuilder();
               return sb.reverse().toString();
            }
        };
        System.out.println(reverser.reverse(line));
    }
}
