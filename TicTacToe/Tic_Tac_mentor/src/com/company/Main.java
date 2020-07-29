package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        printTheGameState(a);
        boolean xWins = checkHasWon('X', a);
        boolean oWins = checkHasWon('O', a);

        String result = "Draw";
        if (xWins && oWins || isImpossible(a)) {
            result = "Impossible";
        } else if (xWins) {
            result = "X wins";
        } else if (oWins) {
            result = "O wins";
        } else if (!isFinished(a)) {
            result = "Game not finished";
        }
        System.out.println(result);
    }

    /**
     * Check if difference between number of Xs and Os in the game is greater then 1.
     * This means that the game is impossible.
     *
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if impossible, <code>false</code> otherwise.
     */
    private static boolean isImpossible(char[] array) {
        int countX = 0;
        int countO = 0;
        for (char c : array) {
            if(c == 'X') {
                countX++;
            } else if (c == 'O') {
                countO++;
            }
        }
        return Math.abs(countX - countO) > 1;
    }

    /**
     * Checks if the game is finished by checking if there are still some '_' characters.
     *
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if game is finished, <code>false</code> otherwise.
     */
    public static boolean isFinished(char[] array) {
        for (char c : array) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    /**
     * Check weather provided character has won.
     *
     * @param c char to check ('X' or 'O')
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if game provided char won, <code>false</code> otherwise.
     */
    public static boolean checkHasWon(char c, char... array) {
        return checkDiagonals(c, array) || checkColumns(c, array) || checkRows(c, array);
    }

    /**
     * Checks if provided char has on in the diagonals.
     * There are only two possible diagonals on positions 0 4 8 and 2 4 6.
     *
     * @param c char to check ('X' or 'O')
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if game provided char won, <code>false</code> otherwise.
     */
    public static boolean checkDiagonals(char c, char... array) {
        return hasWin(c, array[0], array[4], array[8]) || hasWin(c, array[2], array[4], array[6]);
    }

    /**
     * Checks if the provided column has the provided character all along (ex. 'X','X','X' or 'O','O','O').
     *
     * @param c char to check ('X' or 'O')
     * @param array the array representing the column (should have 3 elements).
     * @return <code>true</code> if column is full of same character, <code>false</code> otherwise.
     */
    public static boolean checkColumns(char c, char... array) {
        for (int i = 0; i < 3; i++) {
            if (hasWin(c, array[i], array[i + 3], array[i + 6])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the provided row has the provided character all along (ex. 'X','X','X' or 'O','O','O').
     *
     * @param c char to check ('X' or 'O')
     * @param array the array representing the row (should have 3 elements).
     * @return <code>true</code> if row is full of same character, <code>false</code> otherwise.
     */
    public static boolean checkRows(char c, char... array) {
        for (int i = 0; i < 9; i += 3) {
            if (hasWin(c, array[i], array[i + 1], array[i + 2])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if provided array is full of provided character (ex. 'X','X','X' or 'O','O','O').
     *
     * @param c char to check ('X' or 'O')
     * @param array the array to check (should have 3 elements).
     * @return <code>true</code> if row is full of same character, <code>false</code> otherwise.
     */
    public static boolean hasWin(char c, char... array) {
        return (c * 3) == array[0] + array[1] + array[2];
    }

    /**
     * Prints the game stat represented by the provided array.
     *
     * @param array the array representing the game.
     */
    public static void printTheGameState(char[] array) {
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");
    }
}