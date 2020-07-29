package com.company;

public class PrintGame {
    /*aray-ul se printeaza pe rinduri si coloane*/
    public static void printGame(char[][] game) {
        for (char[] row : game) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
