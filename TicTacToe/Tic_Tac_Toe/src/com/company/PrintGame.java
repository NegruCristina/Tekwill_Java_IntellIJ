package com.company;

public class PrintGame {
    /*aray-ul se printeaza pe rinduri si coloane*/
    public static void printGame(String[][] game) {
        for (String[] row : game) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
