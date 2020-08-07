package com.company;

public class Announcement extends Publication {
    private int daysOfExpire;


    public Announcement(String title, int daysOfExpire) {
        super(title);
        this.daysOfExpire = daysOfExpire;
    }

    public String getType() {
        return "Announcement";
    }

    public String getDetails() {
        return "(days to expire - " + daysOfExpire + ")";
    }
}
