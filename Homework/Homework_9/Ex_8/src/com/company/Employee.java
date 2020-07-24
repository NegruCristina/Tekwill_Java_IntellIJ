package com.company;

public class Employee {
    String name;
    int salary;
    String address;



    public Employee(){
        this.name = "Unknown";
        this.salary = 0;
    }


        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
            this.address = "Unknown";
        }

        public Employee(String name, int salary, String address){
        this.name = name;
        this.salary = salary;
        this.address = address;
        }
}
