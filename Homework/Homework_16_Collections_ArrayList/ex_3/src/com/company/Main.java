package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=readArrayList(sc);
        for (Integer i:list){
           if(i.equals(i++)){
               i++;
              // System.out.println(i++);
            }
            System.out.print(i+ " ");
        }
    }
    private static ArrayList<Integer> readArrayList(Scanner scanner)
    {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
