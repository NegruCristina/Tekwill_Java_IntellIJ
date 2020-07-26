package com.company;

public class Movie {
    public String title;
    public String desc;
    public int year;

    public Movie(String title, int year){
        this(title, "empty", year);
    }

    public Movie(String title, String desc, int year){
        this.title = title;
        this.desc = desc;
        this.year = year;
    }
}
