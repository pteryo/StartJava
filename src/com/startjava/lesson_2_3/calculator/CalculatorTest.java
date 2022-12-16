package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextDouble());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextDouble());
            System.out.println("Результат вычислений: " + calc.calculate());
            scan.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while(!answer.equals("no"));
    }
}