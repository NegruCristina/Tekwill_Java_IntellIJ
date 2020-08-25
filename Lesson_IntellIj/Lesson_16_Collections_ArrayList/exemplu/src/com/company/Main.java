package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Alex");
        name.add("Mihai");
        name.add("Cristina");
        name.add("Ion");
//aceasta metoda iterator() din interfata Iterator trece prin aray si-l afiseaza la ecran
        Iterator<String> iterable = name.iterator();
        while (iterable.hasNext()) {
            String next = iterable.next();
            System.out.println(next);
        }
    }
}
