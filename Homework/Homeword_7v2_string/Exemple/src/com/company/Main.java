package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder newWord=new StringBuilder("Cristina");
        System.out.println(newWord.charAt(2));
        newWord.setCharAt(0,'M');
       newWord.deleteCharAt(0);
        newWord.setCharAt(0,'C');
        newWord.append("+");
        System.out.println(newWord);

    }
}
