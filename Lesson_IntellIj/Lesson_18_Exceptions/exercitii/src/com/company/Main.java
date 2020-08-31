package com.company;

public class Main {

    public static void main(String[] args) {
	try{
	    int x=6/0;
    }catch (Exception ex){
        System.out.println(ex.getMessage());
        System.out.println(ex.getStackTrace());
    }
    }
}
