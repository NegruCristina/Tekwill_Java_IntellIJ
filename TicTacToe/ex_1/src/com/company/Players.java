package com.company;

public class Players {
    /*aici introducem 2 jucatori, si trecem prin switch si pozitionam valorile in aray */
    public static void players(char[][] game, int poz, String player1) {
        char symbol = ' ';
        if (player1.equals("player1")) {
            symbol = 'x';
        } else if (player1.equals("player2")) {
            symbol = 'o';
        } else if (player1.equals("comp")) {
            symbol = '_';
        }
        switch (poz) {
            case 1:
                game[1][1] = symbol;
                break;
            case 2:
                game[1][2] = symbol;
                break;
            case 3:
                game[1][3] = symbol;
                break;
            case 4:
                game[2][1] = symbol;
                break;
            case 5:
                game[2][2] = symbol;
                break;
            case 6:
                game[2][3] = symbol;
                break;
            case 7:
                game[3][1] = symbol;
                break;
            case 8:
                game[3][2] = symbol;
                break;
            case 9:
                game[3][3] = symbol;
                break;
            default:
                break;
        }
    }
}
