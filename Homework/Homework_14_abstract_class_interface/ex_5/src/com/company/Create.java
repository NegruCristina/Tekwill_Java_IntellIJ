package com.company;

public class Create  {
    String text;
    int repeats;

    Create(String text, int repeats) {
        this.text = text;
        this.repeats = repeats;
    }

    public static Runnable createRunnable(String text, int repeats) {
//am creat o clasa anonima pe baza la interfata Runnable
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < repeats; i++) {
                    System.out.println(text);
                }
            }
        };

    }
}



