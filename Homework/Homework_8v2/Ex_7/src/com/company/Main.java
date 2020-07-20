package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split("\\s+");
        int[] numbers= Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
                 sort(numbers);
        Arrays.stream(numbers).forEach(e-> System.out.print(e + " "));
    }
    public static void sort(int[] numbers){
       Arrays.sort(numbers);

    }
}
