package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static final char     MINES     = 'X';
    private static final char     CHARACTER = '.';
    private static       char[][] game      = new char[9][9];
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();
    public static void main(String[] args) {
        fillGame();
        printGame();
        System.out.println("How many mines do you want on the field?");
        goMines();
        printGame();
    }
    private static void goMines() {
        int numberOfMines = sc.nextInt();
        for (int i = 0; i < numberOfMines; i++) {
            int rand1 = random.nextInt(9);
            int rand2 = random.nextInt(9);
            game[rand1][rand2] = MINES;
        }
    }
    private static void printGame() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void fillGame() {
        for (char[] chars : game) {
            Arrays.fill(chars, CHARACTER);
        }
    }
}