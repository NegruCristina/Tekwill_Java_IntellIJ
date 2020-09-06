package com.company;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public User(String firstName, String lastName) {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        return firstName.concat(lastName);
    }
}
