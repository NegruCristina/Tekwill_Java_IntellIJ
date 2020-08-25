package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);
//afiseaza ca aray cu []
        System.out.println(list);
        //afiseaza ca un sir de numere fara[]
        for (Integer i:list) {
            System.out.print(i +" ");

        }
    }
}
