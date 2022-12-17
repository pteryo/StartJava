package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя 1ого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя 2ого игрока: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2, scan);
        //пока нет ответа о выходе
        do {
            game.start();
            //продолжать ли игру 
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while(!answer.equals("no"));
    }
}