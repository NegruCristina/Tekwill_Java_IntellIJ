package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Currency ISO4217=Currency.valueOf(sc.nextLine());
        switch (ISO4217){
            case USD:
                System.out.println("USD-United States dollar");
                break;
            case EUR:
                System.out.println("EUR-Euro");
                break;
            case GBP:
                System.out.println("GBP-Pound sterling");
                break;
            case RUB:
                System.out.println("RUB-Russian ruble");
                break;
            case UAH:
                System.out.println("UAH-Ukrainian hryvnia");
                break;
            case KZT:
                System.out.println("KZT-Kazakhstani tenge");
                break;
            case CAD:
                System.out.println("CAD-Canadian dollar");
                break;
            case JPY:
                System.out.println("JPY-Japanese yen");
                break;
            case CNY:
                System.out.println("CNY-Chinese yuan");
                break;
        }

    }
}
