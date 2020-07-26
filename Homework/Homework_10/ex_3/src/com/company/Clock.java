package com.company;

import static java.lang.System.*;

public class Clock {
    private int hours;
    private int minutes;

    //punem conditia pentru ora si minute sa nu depaseasca intervalul din conditie
    public Clock(int h, int m) {
        hours = ((h >= 0 && h <= 24) ? h : 0);
        minutes = ((m >= 0 && m <= 60) ? m : 0);
    }

    //ii dam un format de ceas la Clock
    public String clock() {
        return String.format("%02d:%02d", hours, minutes);
    }

    //
    public void next() {
        for (int i = 0; i >= this.hours; i++) {
            System.out.println(hours);
            for (int j = 0; j >= this.minutes; j++) {
                System.out.println(minutes++);
            }
        }
    }
// nu merge programul nu se incrementeaza 
}
