package com.company;

public class Programmer extends TeamLead {
    private int numProgrammer;

    public Programmer(int numProgrammer) {
        //aici el trimite numProgramer la superclass de unde se extinde
        super(numProgrammer);
        this.numProgrammer = numProgrammer;
       employ();
    }
//noi am pus in superclass private la aceasta metoda si se apeleaza aceasta metoda cind noi facem un nou obiect
    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}
