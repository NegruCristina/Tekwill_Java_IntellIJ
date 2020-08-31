package com.company;

public class Journale implements Printable{
  private String name;

    String getName(){
        return name;
    }
    Journale(String name){
        this.name=name;
    }
    public void print(){
        System.out.println(name);
    }
}
