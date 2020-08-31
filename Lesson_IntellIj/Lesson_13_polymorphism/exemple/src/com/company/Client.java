package com.company;

public class Client extends Person {
    protected String contractNumber;
    protected boolean gold;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public boolean isGold() {
        return gold;
    }
}
