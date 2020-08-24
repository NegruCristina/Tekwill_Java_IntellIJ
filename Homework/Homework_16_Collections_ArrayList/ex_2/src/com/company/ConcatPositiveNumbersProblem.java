package com.company;

import java.util.ArrayList;

public class ConcatPositiveNumbersProblem {
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        //facem un array nou si-l concatitam cu ambele existente si apoi il afisam
        ArrayList<Integer> all = new ArrayList<>();
        all.addAll(l1);
        all.addAll(l2);
        for (Integer i : all) {
            if (i > 0)
                System.out.print(i + " ");
        };
        //nu stiu ce sa pun la return, dar asa merge si tot odata imi da eroare
        return null;
    }
}