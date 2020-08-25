package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initializam un aray unde datele le dam de la tastatura
        String[] ints = sc.nextLine().split(" ");
        //punem conditia dupa care va trebui sa caute un int de la tastatura
        int n = sc.nextInt();

        List<Integer> intArray = new ArrayList<Integer>();
        //prin acest for noi adaugam in araylist elementele care le dam de la tastatura din string aray
        for (String intS : ints) {
            //din string noi adaugam si transformam valorile din aray string in araylist care este integer
            intArray.add(Integer.valueOf(intS));
        }

        //initializam o valoare care va fi cea mai mare din intger
        int diff = Integer.MAX_VALUE;
//facem un araylist nou
        List<Integer> result = new ArrayList<>();
//il afisam
        for (Integer nr : intArray) {
            //adaugam o variabila temporara
            // care se afla prin diferenta dintre primul numar din aray si numarul de referinata care este conditia
            int tempDiff = Math.abs(nr - n);
            //punem o conditie daca acest numar care l-am aflat mai sus este egal cu cel mai mare integer,
            // el este fals si trecem la urmatoarea conditie
            if (tempDiff == diff) {
                result.add(nr);
                //unde verificam daca acel numar care l-am aflat m-ai sus este mai mic ca cel mai mare integer atunci
            } else if (tempDiff < diff) {
                //atunci la schimbam valoarea lui diff care era cel mai mare integeer
                diff = tempDiff;
                //stergem tot ce era in integer
                result.clear();
                //adaugam acest numar care noi l-am verificat
                result.add(nr);
            }
        }
        //aici sortam cum era in conditie ca sa sortam in ordine crescatoarea
        Collections.sort(result);
        for (Integer nr : result) {
            System.out.print(nr + " ");
        }
    }

}
