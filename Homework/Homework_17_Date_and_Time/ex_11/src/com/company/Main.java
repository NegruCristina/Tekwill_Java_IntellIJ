package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //adaugam ora minim cind se inchide
        LocalTime offTime = LocalTime.of(20, 0);

        Scanner sc = new Scanner(System.in);
        //adaugam numarul maxim de magazine
        int number = sc.nextInt();
//formam o lista de magazine
        List<String> list = new ArrayList<>();
//trecem prin lista de magazine
        for (int i = 0; i < number; i++) {
            //adaugam magazinele de la tastatura
            String token = sc.nextLine();
            //lista de magazine o pastram intr-un array si facem cuvintele doar un spatiu intre ele
            String[] array = token.split(" ");
            //formam o ora folosind elementul de pe indexul 2 a array-ului si eliminam toate spatiile libere
            LocalTime localTime = LocalTime.parse(array[1].trim());
            //verificam ora care se inchide magazinul si cu ora minim cind se inchide
            if (localTime.isAfter(offTime)) {
                //adaugam magazinul care se inchide dupa ora minim cind noua ne trebuie
                list.add(array[0]);
            }
        }
//afisam magazinele la ecran
        for (String store : list) {
            System.out.println(store);
        }
    }
}
