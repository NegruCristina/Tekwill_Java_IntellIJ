package com.company;

public class Employee {
    private String name;
    private String email;
    private int number;


    public Employee(String name, String email, int number) {
        System.out.println("Colectam date despre client");
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Trimitem email" + this.name + this.email);
    }

    public String toString() {
        return name + "" + email + "" + number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }
}

