package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist) {
       //facem un arr nou une vom salva rezultatul
        ArrayList<String> arr = new ArrayList<>();
        //afisam la ecran aray-ul phones
        for (String s : phones) {
            //punem conditia daca in stringurile s care se contine din aray-ul phone nu se contine blacklist->
            if (!blacklist.contains(s)) {
                //->atunci adaugam datele din s care se trag din phones in noul array care l-am format
                arr.add(s);
            }
        }
        return arr;
        //aceasta metoda va sterge si din principalul aralist datele si pe urma nu le vom putea folosi
//    phones.removeAll(blacklist);
//        return phones;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //split(\\s+) inseamna ca se sterge urmatoarele 1++ locuri libere din sirul adaugat
        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));
        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}

