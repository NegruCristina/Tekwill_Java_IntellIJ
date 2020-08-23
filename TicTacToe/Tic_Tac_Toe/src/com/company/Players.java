package com.company;

public class Players {
    /*aici introducem 2 jucatori, si trecem prin switch si pozitionam valorile in aray */
    public static void players(String[][] game, String poz, String player1) {
        String symbol = " ";
        if (player1.equals("player1")) {
            symbol = "x";
        } else if (player1.equals("player2")) {
            symbol = "o";
        }
        switch (poz) {
            case "1 3":
                game[1][1] = symbol;
                break;
            case "2 3":
                game[1][2] = symbol;
                break;
            case "3 3":
                game[1][3] = symbol;
                break;
            case "1 2":
                game[2][1] = symbol;
                break;
            case "2 2":
                game[2][2] = symbol;
                break;
            case "3 2":
                game[2][3] = symbol;
                break;
            case "1 1":
                game[3][1] = symbol;
                break;
            case "2 1":
                game[3][2] = symbol;
                break;
            case "3 1":
                game[3][3] = symbol;
                break;
            case "one one":
            case "two two":
            case "one two":
            case "one three":
            case "two three":
            case "three three":
                System.out.println("You should enter numbers!");
                break;
            default:
                System.out.println("Coordinates should be" + " from 1 to 3!");
                break;
        }
        if (poz.equals(symbol)) {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }
}
