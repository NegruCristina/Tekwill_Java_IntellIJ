package com.company;

public class Person {

    protected String name;
    protected int yearsOfBirthDay;
    protected String address;

    public Person(String name,int yearsOfBirthDay, String address){
        this.name=name;
        this.yearsOfBirthDay=yearsOfBirthDay;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearsOfBirthDay(int yearsOfBirthDay) {
        this.yearsOfBirthDay = yearsOfBirthDay;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfBirthDay() {
        return yearsOfBirthDay;
    }

    public String getAddress() {
        return address;
    }
}
