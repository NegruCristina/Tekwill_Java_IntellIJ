package com.company;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }
public User(String firstName, String lastName){
        this.firstName="Unknown";
        this.lastName="Unknown";
}

    public void setFirstName(String firstName){
        if(firstName==null){
            firstName.split("");
        }
    }
    public void setLastName(String lastName){
        if(lastName==null){
            lastName.split("");
        }
    }
    public String getFullName(){
        return firstName.concat(lastName);
    }
}
