package com.company;

import java.util.Arrays;

public class Book {
    private String title;
    private int yearsOfPublishing;
    private String[] authors;
public Book(String title, int yearsOfPublishing, String[] authors){
    this.title =title;
    this.yearsOfPublishing=yearsOfPublishing;
    this.authors=authors;
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int getYearsOfPublishing(){
        return yearsOfPublishing;
    }
    public  void setYearsOfPublishing(int yearsOfPublishing){
        this.yearsOfPublishing=yearsOfPublishing;
    }
    public String[] getAuthors(){
        return  authors;
    }
    public void setAuthors(){
    this.authors= Arrays.copyOf(authors, authors.length);
    }
  //  public void show(String title, int yearsOfPublishing, String[] authors){
//        System.out.println();
//    }
}

