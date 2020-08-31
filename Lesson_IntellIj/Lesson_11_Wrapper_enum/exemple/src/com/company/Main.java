package com.company;

public class Main {

    public static void main(String[] args) {
        //wrapper
int primitive =100;
Integer reference=Integer.valueOf(primitive);
        System.out.println(reference);
        int anotherPrimitive=reference.intValue();
        System.out.println(anotherPrimitive);

        double primitiveDouble=10.8;
        Double wrapperDouble=primitiveDouble;
        System.out.println(wrapperDouble);
        double anotherDouble=wrapperDouble;
        System.out.println(anotherDouble);



        //enum

ChangeLevel[] level =ChangeLevel.values();
        System.out.println(level);
    }
}
