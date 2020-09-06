package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        switch (type){
            case "long":
                long longVal=Long.parseLong(sc.nextLine());
                long longResult=getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                int intVal=Integer.parseInt(sc.nextLine());
                int intResult= getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            case"short":
                short shortVal=Short.parseShort(sc.nextLine());
                short shortResult= getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
    public static long getMaxMinusCurrent(long val){
                return Long.MAX_VALUE - val;
        }
    public static int getMaxMinusCurrent(int val){
        return Integer.MAX.VALUE - val;
    }
    public static short getMaxMinusCurrent( short val){
        return (short) (Short.MAX_VALUE - val);
    }
}
