package com.company;

public class Multipliction extends IntBinaryOperation {

    public Multipliction(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
