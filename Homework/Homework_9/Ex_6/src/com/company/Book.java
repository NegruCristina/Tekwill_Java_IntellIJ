package com.company;

public class Book {
    String title;
    int yearOfPublishing;
    String[] authors;


    public Book(String title, int yearOfPublishing, String[] authors){
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = new String[]{"Ion", "Mihai", "Grigore"};
    }
    public void show(){

        System.out.println("This is title " + title +" This is year " + yearOfPublishing + " This is authors " +authors);
    }
}
