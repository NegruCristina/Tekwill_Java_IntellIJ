package com.company;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("Cristina");
        programmer.setYearsOfBirthDay(1990);
        programmer.setAddress("Sadoveanu");
        programmer.setStartDate(new Date());
        programmer.setSalary(500_000L);
        programmer.setProgrammingLanguages(new String[]{"SQL", "JAVA", "JavaScript"});
        System.out.println(programmer.getName());
        System.out.println(programmer.getYearsOfBirthDay());
        System.out.println(programmer.getAddress());
        System.out.println(programmer.getStartDate());
        System.out.println(programmer.getSalary());
        System.out.println(Arrays.toString(programmer.getProgrammingLanguages()));
    }
}
