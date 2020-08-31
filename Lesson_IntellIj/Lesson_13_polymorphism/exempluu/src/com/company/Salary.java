package com.company;

public class Salary extends Employee {
    private double salary;


    public Salary(String name, String email, int number, double salary) {
        super(name, email, number);
        setSalary(salary);
    }


    public void mailCheck() {
        System.out.println("mailCheck din clasa Salary");
        System.out.println("Trimitem email " + getName() + " cu salariul " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }


    public double cumputerPay() {
        System.out.println("Calculam salariul pentru " + getName());
        return salary / 52;
    }
}
