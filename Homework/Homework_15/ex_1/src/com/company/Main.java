package com.company;

public class Main {

    public static void main(String[] args) {
ComplexNumber a =new ComplexNumber(8.8,9.9);
ComplexNumber b=new ComplexNumber(8.8,9.9);

        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
