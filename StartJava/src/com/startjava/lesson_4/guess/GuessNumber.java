package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private Scanner scan;

    public GuessNumber(Player player1, Player player2, Scanner scan) {
        this.player1 = player1;
        this.player2 = player2;
        this.scan = scan;
    }

    public void start() {
        generateSecretNumber();
        do {
            inputNumber(player1);
            if (isGuessed(player1)) {
                break;
            }
            inputNumber(player2);
            if (isGuessed(player2)) {
                break;
            }
        } while (true);
    }
    
    private void inputNumber(Player player) {
        System.out.print("Игрок " + player.getName() + ": ");
        player.setNumber(scan.nextInt());
        scan.nextLine();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
    }

    public boolean isGuessed(Player player) {
        if (secretNum == player.getNumber()) {
            System.out.println("Число = " + secretNum + ". Игрок " + player.getName() + " победил.");
            return true;
        }
        if (player.getNumber() < secretNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер.");
        }
        return false;
    }
}