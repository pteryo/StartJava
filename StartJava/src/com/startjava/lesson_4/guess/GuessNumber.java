package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private Scanner scan;
    static final int maxTurns = 10;
    static final int maxRandom = 100;

    public GuessNumber(Player player1, Player player2, Scanner scan) {
        this.player1 = player1;
        this.player2 = player2;
        this.scan = scan;
    }

    public void start() {
        generateSecretNumber();
        player1.clearGuesses();
        player2.clearGuesses();
        System.out.println("У каждого игрока по " + maxTurns + " попыток");
        do {
            if ((player1.checkLimitReached(maxTurns)) && (player2.checkLimitReached(maxTurns))) {
                break;
            }
            if (doTurn(player1)) {
                break;
            }
            if (player1.checkLimitReached(maxTurns)) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if (doTurn(player2)) {
                break;
            }
            if (player2.checkLimitReached(maxTurns)) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        } while (true);
        printGuessLine(player1);
        printGuessLine(player2);
    }

    private void inputNumber(Player player) {
        System.out.print("Игрок " + player.getName() + ": ");
        player.setNumber(scan.nextInt());
        scan.nextLine();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNum = random.nextInt(maxRandom) + 1;
    }

    public boolean isGuessed(Player player) {
        if (secretNum == player.getNumber()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber()
                    + " с " + player.getCurrentGuessNum() + " попытки");
            return true;
        }
        if (player.getNumber() < secretNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер.");
        }
        return false;
    }

    private boolean doTurn(Player player) {
        inputNumber(player);
        return (isGuessed(player));
    }
    private void printGuessLine(Player player) {
        int[] guess =  player.getGuessList();
        System.out.print("Попытки " + player.getName() + ": ");
        for (int i = 0; i < guess.length; i++) {
            System.out.print(guess[i] + " ");
        }
        System.out.println();

    }
}