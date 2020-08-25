package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final List<Long> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Long::parseLong).collect(Collectors.toList());
        final Long edge = Long.parseLong(sc.nextLine());
        remoteElementsGreaterThanValue(list.iterator(), edge);
        list.forEach(e -> System.out.println(e + " "));


    }

    public static void remoteElementsGreaterThanValue(Iterator<Long> iterator, Long val) {
        //verifica daca in iterator sunt urmatoarele elemente
        while (iterator.hasNext()) {
            //ii dam un long unde el pastreaza urmatorul element din iterator
            Long iter = iterator.next();
            //ii punem conditie ca acest long trebuie sa fie mai mare ca valoarea data de la consola
            if (iter > val) {
                //sa stearga toate elementele  m-ai mari din if
                iterator.remove();
            }

        }
    }
}
