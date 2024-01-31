package games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int COUNT_ROUNDS = 3;
    public static void calculatorGame() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        Random rnd1 = new Random();
        Random rnd2 = new Random();
        Random action = new Random();
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        while (correctAnswers < COUNT_ROUNDS) {
            int choiceAction = action.nextInt(3);
            String rndAction = "null";
            int correctAnsw = 0;
            int rndNum1 = rnd1.nextInt(20);
            int rndNum2 = rnd2.nextInt(20);
            if (choiceAction == 0) {
                rndAction = "-";
                correctAnsw = rndNum1 - rndNum2;
            }
            if (choiceAction == 1) {
                rndAction = "+";
                correctAnsw = rndNum1 + rndNum2;
            }
            if (choiceAction == 2) {
                rndAction = "*";
                correctAnsw = rndNum1 * rndNum2;
            }
            System.out.println("Question: " + rndNum1 + " " + rndAction + " " + rndNum2);
            System.out.print("Your answer: ");
            int playersResponse = sc.nextInt();
            if (playersResponse == correctAnsw) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + playersResponse
                        + "' is wrong answer ;(. Correct answer was '" + correctAnsw + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        sc.close();
    }
}
