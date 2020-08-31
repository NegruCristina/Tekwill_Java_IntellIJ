package com.company;

public class Main {

    public static void main(String[] args) {
Book book = new Book("Nuvel", 2020, new String[]{"Ion", "Mihai"});
book.getAuthors();
book.getTitle();
book.setYearsOfPublishing(2019);
//book.show();
    }
}
