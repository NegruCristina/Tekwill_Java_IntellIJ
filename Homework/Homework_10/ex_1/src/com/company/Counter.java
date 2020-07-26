package com.company;

public class Counter {
    private int current;


    public void inc(int current) {
        for (int i = 0; i < current; i++) {
            this.current = current + 1;
        }
    }


    public int getCurrent() {
        return current;
    }

}
