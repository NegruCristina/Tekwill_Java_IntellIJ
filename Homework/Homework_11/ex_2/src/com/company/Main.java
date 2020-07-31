package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
       // System.out.println(convert(longVal));
    }

//
//    public static int convert(Long val) {
//        int intValue = val.intValue();
//        if(intValue==null){
//            return intValue;
//        } else  if (intValue >= Integer.MAX_VALUE) {
//            return Integer.MAX_VALUE;
//        } else if (intValue <= Integer.MIN_VALUE) {
//            return Integer.MIN_VALUE;
//        }
//        return intValue;
//    }
}
//nu merge
