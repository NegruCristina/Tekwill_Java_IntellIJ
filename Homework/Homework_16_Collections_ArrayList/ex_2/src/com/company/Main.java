package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.company.ConcatPositiveNumbersProblem.concatPositiveNumbers;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);
        ArrayList<Integer> result = concatPositiveNumbers(list1,list2);
        result.forEach(n -> System.out.print(n + " "));
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner)
    {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
