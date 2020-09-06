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


    public void next() {
        minutes++;
        if(minutes==60){
            minutes=0;
            hours++;
            if(hours==13){
                hours=1;
            }
        }
    }

}
