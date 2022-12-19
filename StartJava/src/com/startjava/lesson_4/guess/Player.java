package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] number;
    private int currentGuessNum;
    static final int maxTurns = 10;

    public Player(String name) {
        this.name = name;
        number = new int[maxTurns];
        clearGuesses();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number[currentGuessNum - 1];
    }

    public int[] getGuessList() {
        return Arrays.copyOf(number, currentGuessNum);
    }

    public int getCurrentGuessNum() {
        return currentGuessNum;
    }

    public void setNumber(int number) {
        this.number[currentGuessNum++] = number;
    }

    public boolean checkLimitReached( int Limit) {
        if (currentGuessNum + 2 > Limit) {
            return true;
        } else {
            return false;
        }
    }

    public void clearGuesses() {
        Arrays.fill(number,0,currentGuessNum, 0);
        currentGuessNum = 0;
    }
}