package com.company;

public class Main {

    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Cristina", "neg@gamil.com", 5, "Java", skills);
        String[] methods={"natural network","decision tree", "byesian algoritms" };
        DataAnalyst analist =new DataAnalyst("Mary", "mary@gmail.com", 2, true, methods);
        System.out.println(developer.toString());
        System.out.println(analist.toString());
    }
}
