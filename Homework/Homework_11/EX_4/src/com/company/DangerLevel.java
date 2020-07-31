package com.company;

public enum DangerLevel {
    HIGH(3), MEDIUM(2), LOW(1);
    int section;
    DangerLevel(int section){
        this.section=section;
    }
    public int getLevel(){
        return section;
    }
}
