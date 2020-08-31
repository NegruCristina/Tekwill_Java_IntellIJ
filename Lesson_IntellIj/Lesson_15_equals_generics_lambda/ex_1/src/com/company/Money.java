package com.company;

import java.util.Objects;

public class Money {
    int amount;
    String currencyCode;


    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);

    }

    @Override
    public int hashCode() {
        return Objects.hash(amount,currencyCode);
    }
}
