package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime =
                LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime =
                LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));


    }

    public static LocalDateTime merge(LocalDateTime dateTime1,
                                      LocalDateTime dateTime2) {
        //facem comparatie intre data prima si a 2 cu ajutorul lui math.max si apoi introducem rezultatele int in clas de mai jos
        int years = Math.max(dateTime1.getYear(), dateTime2.getYear());
        int month = Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        int day = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        int hour = Math.max(dateTime1.getHour(), dateTime2.getHour());
        int min = Math.max(dateTime1.getMinute(), dateTime2.getMinute());
        int sec = Math.max(dateTime1.getSecond(), dateTime2.getSecond());

        return LocalDateTime.of(years, month, day, hour, min, sec);


    }
}
