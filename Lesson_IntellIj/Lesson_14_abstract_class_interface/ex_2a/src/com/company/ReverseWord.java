package com.company;

public class ReverseWord implements ReversedString {
    String word;

    public ReverseWord(String word) {
        this.word = word;
    }

    public String get() {
        StringBuilder w = new StringBuilder(word);
        return w.reverse().toString();
    }



}
