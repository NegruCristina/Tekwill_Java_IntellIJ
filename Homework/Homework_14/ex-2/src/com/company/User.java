package com.company;

public class User extends BaseEntity {
    protected String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Override
    public String toString() {
        return getId() + " My name is " + getName() + " Version:  " + getVersion();
    }
}
