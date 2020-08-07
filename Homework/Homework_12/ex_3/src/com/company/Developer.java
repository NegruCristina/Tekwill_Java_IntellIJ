package com.company;

import java.util.Arrays;

public class Developer extends Employee {
    String mainLanguage;
    String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString() {
        return name + " " + email + " " + experience + " " + mainLanguage + " " + Arrays.toString(skills);
    }
}

