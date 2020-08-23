package com.company;


public class Winer {
    public static boolean winer(String[][] game) {
        if (game[1][1] == "x" && game[2][1] == "x" && game[3][1] == "x") {
            System.out.println("X wins");
            return true;
        } else if (game[1][1] == "x" && game[1][2] == "x" && game[1][3] == "x") {
            System.out.println("X wins");
            return true;
        } else if (game[1][1] == "x" && game[2][2] == "x" && game[3][3] == "x") {
            System.out.println("X wins");
            return true;
        } else if (game[1][1] == "o" && game[1][2] == "o" && game[1][3] == "o") {
            System.out.println("O wins");
            return true;
        } else if (game[1][1] == "o" && game[2][1] == "o" && game[3][1] == "o") {
            System.out.println("O wins");
            return true;
        } else if (game[1][1] == "o" && game[2][2] == "o" && game[3][3] == "o") {
            System.out.println("O wins");
            return true;
        }else if(game[1][1]=="_" &&game[2][2]=="_"&&game[3][1]=="_"){
            System.out.println("Game not finished");
            return true;
        } else if (game[1][1] == "x" && game[2][1] == "x" && game[3][1] == "x"
                && game[1][2] == "o" && game[2][2] == "o" && game[3][2] == "o") {
            System.out.println("Imposible");
            return true;
        }else if(game[1][1]=="x"&&game[2][2]=="x"&&game[1][3]=="x"&&game[3][2]=="x"&&game[3][3]=="x"){
            System.out.println("Imposible");
            return true;
        } else if (game[1][1] == "x" && game[1][2] == "o" && game[1][3] == "x" && game[2][1] == "0" && game[2][2] == "o"
                && game[2][3] == "x" && game[3][1] == "x" && game[3][2] == "x" && game[3][3] == "o") {
            System.out.println("Draw");
            return true;
        }
        return false;
    }
}
