package com.company;

public class TeamLead {
    private int numTeamLead;


    public TeamLead(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }
//daca noi facem o metoda privata este apelata doar in interior
    private void employ() {
        System.out.println(numTeamLead + " teamlead");
    }
}
