package com.company;

public class Create implements Runnable {
    String text;
    int repeats;

    Create(String text, int repeats){
        this.text=text;
        this.repeats=repeats;
    }
    public static Runnable createRunnable(String text, int repeats) {
        int i=0;
        if(i<=repeats) {
            createRunnable("hello", 3);
            i++;
        }
        return null;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    @Override
    public void run() {

        System.out.println(" Say hello "+createRunnable("hello",4));
    }
}



