package com.company;

public class Main {

    public static void main(String[] args) {
        Salary s = new Salary("Cristina", "aaa@bbb.gmail.com", 3, 20000);
        Employee e = new Salary("Mihai", "qqq@wwww.gmail.com", 4, 20000);
        System.out.println("Chemam mailCheck pentru Salary");
        s.mailCheck();
        System.out.println("Chemam mailCheck pentru Employee");
        e.mailCheck();
    }
}
