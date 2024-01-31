package games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int COUNT_ROUNDS = 3;
    public static void gcdGame() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while (correctAnswers < COUNT_ROUNDS) {
            int rndNum1 = rnd.nextInt(50);
            int rndNum2 = rnd.nextInt(50);
            int a = rndNum1;
            int b = rndNum2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int correctAns = a;
            System.out.println("Question: " + rndNum1 + " " + rndNum2);
            System.out.print("Your answer: ");
            int playersResponse = sc.nextInt();
            if (playersResponse == correctAns) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + playersResponse
                        + "' is wrong answer ;(. Correct answer was '" + correctAns + "'.");
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
