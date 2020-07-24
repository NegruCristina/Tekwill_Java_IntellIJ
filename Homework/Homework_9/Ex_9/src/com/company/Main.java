package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName=sc.nextLine();
        //se verifica daca firstName este = cu nul atunci se afiseaza firstName
        firstName ="null".equals(firstName) ? null : firstName;
        String lastName =sc.nextLine();
        lastName ="null".equals(lastName) ? null : lastName;
        System.out.println(prepareFullName(firstName, lastName));
    }



    public static String prepareFullName(String firstName, String lastName){

        if ("null".equals(firstName)) {
            return firstName;
        }
     else if ("null".equals(lastName)){
            return lastName;
        }
     else {
            firstName.concat(lastName);
            return firstName.concat(" ").concat(lastName);
        }
    }
}
