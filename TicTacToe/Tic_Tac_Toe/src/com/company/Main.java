package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.Players.players;
import static com.company.PrintGame.printGame;
import static com.company.Winer.winer;
public class Main {
    //facem un aray bi-dimensional, prin parti si lateral adaugam simboluri ca in ex.2
    public static void main(String[] args) {
        char[][] game = {{'_', '_', '_', '_', '_'},
                {'|', ' ', ' ', ' ', '|'},
                {'|', ' ', ' ', ' ', '|'},
                {'|', ' ', ' ', ' ', '|'},
                {'_', '_', '_', '_', '_'}
        };
boolean gameOver=false;



/*introducem valorile int unde ar trebuie sa se pozitioneze valorile introduse de la scaner,
 cu ajutorul clasei winer verificam cine a cistigat in depedenta cine si unde a introdus valori */

        while (!gameOver) {
            Scanner sc = new Scanner(System.in);
            int playersPos = sc.nextInt();
            players(game, playersPos, "player1");
            gameOver=winer(game);
            if(gameOver){
                break;
            }

            int player2Pos = sc.nextInt();
            players(game, player2Pos, "player2");
            gameOver=winer(game);
            if(gameOver){
                break;
            }
            printGame(game);
        }
    }

}
