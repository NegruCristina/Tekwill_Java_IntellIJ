package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
       System.out.println(convert(longVal));
    }


    public static int convert(Long val) {
        if(val==null){
            return 0;
        } else  if (val >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return val.intValue();
    }
}

