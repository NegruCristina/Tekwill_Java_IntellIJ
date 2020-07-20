package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void addValueByIndex(long[] array, int index, long value){
    array[index]+=value;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToLong(Long ::parseLong)
                .toArray();
        int index = sc.nextInt();
        long value = sc.nextLong();
        addValueByIndex(array , index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
