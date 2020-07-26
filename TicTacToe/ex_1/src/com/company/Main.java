package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //facem un aray bi-dimensional, prin parti si lateral adaugam simboluri ca in ex.2
    public static void main(String[] args) {
        char[][] game = {{'_', '_', '_', '_', '_'},
                {'|', ' ',' ', ' ', '|'},
                {'|', ' ',' ', ' ', '|'},
                {'|',' ', ' ', ' ', '|'},
                {'_', '_','_', '_', '_'}
        };

/*introducem valorile int unde ar trebuie sa se pozitioneze valorile introduse de la scaner,
prin metoda Random care genereaza o cifra intr-o pozitie, apoi cu metoda printgame printam symbol introduse */
        while (true) {
            Scanner sc = new Scanner(System.in);
            int playersPos = sc.nextInt();
            players(game, playersPos, "player1");
            Random random = new Random();
            int player2Pos = random.nextInt(9) + 1;
            players(game, player2Pos, "player2");
            printGame(game);
        }
    }
/*aray-ul se printeaza pe rinduri si coloane*/
    public static void printGame(char[][] game) {
        for (char[] row : game) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
/*aici introducem 2 jucatori, si trecem prin switch si pozitionam valorile in aray */
    public static void players(char[][] game, int poz, String player1) {
        char symbol = ' ';
        if (player1.equals("player1")) {
            symbol = 'x';
        } else if (player1.equals("player2")) {
            symbol = 'o';
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
/*nu stiu cum sa pun pozitiile din switch in if aici ca sa-mi arate aceste rezultate care trebuie sa le printeze
public static String winer(){
        if(1,2,3){
        System.out.println("X wins");
    }else if(1,4,5){
        System.out.println("X wins");
    }else if(1,4,7){
        System.out.println("X wins");
    }else if(3,6,9){
        System.out.println("O wins");
    }else if(7,8){
        System.out.println("Game not finished");
    }else if(0,8,9){
        System.out.println("Impossible");
    }
}*/
}
