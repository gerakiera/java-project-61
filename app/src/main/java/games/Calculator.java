package games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_ACTION = 3;
    private static final int RND_MAX_NUM = 20;

    public static void calculatorGame() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        Random rnd = new Random();
        Random action = new Random();
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        while (correctAnswers < COUNT_ROUNDS) {
            int choiceAction = action.nextInt(RND_MAX_ACTION);
            String rndAction = "null";
            int correctAnsw = 0;
            int rndNum1 = rnd.nextInt(RND_MAX_NUM);
            int rndNum2 = rnd.nextInt(RND_MAX_NUM);
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
        if (correctAnswers == COUNT_ROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
        sc.close();
    }
}
