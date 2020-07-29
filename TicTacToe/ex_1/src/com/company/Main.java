package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.Players.players;
import static com.company.PrintGame.printGame;

public class Main {
    //facem un aray bi-dimensional, prin parti si lateral adaugam simboluri ca in ex.2
    public static void main(String[] args) {
        char[][] game = {{'_', '_', '_', '_', '_'},
                {'|', ' ', ' ', ' ', '|'},
                {'|', ' ', ' ', ' ', '|'},
                {'|', ' ', ' ', ' ', '|'},
                {'_', '_', '_', '_', '_'}
        };


/*introducem valorile int unde ar trebuie sa se pozitioneze valorile introduse de la scaner,
prin metoda Random care genereaza o cifra intr-o pozitie, apoi cu metoda printgame printam symbol introduse */
        while (true) {
            Scanner sc = new Scanner(System.in);
            int playersPos = sc.nextInt();
            players(game, playersPos, "player1");
           // players(game, playersPos, "comp");
          //  Random random = new Random();
            int player2Pos = sc.nextInt();
            players(game, player2Pos, "player2");
            printGame(game);
        }
    }

}
