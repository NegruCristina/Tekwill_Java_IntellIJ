package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim :
                                                String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static <T> void applyFunction(T[] array, Function<T, T>
            func) {
        int i = 0;
        for (T a : array) {
            array[i++]=a;
            System.out.println(array);
        }
    }
}
