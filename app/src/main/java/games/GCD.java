package games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.getNameOnly;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void gcdGame() {
        System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli();
        cli.getName();
        System.out.println(RULES);
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd1 = new Random();
        Random rnd2 = new Random();
        while (correctAnswers < 3) {
            int rndNum1 = rnd1.nextInt(50);
            int rndNum2 = rnd2.nextInt(50);;
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
                System.out.println("'" + playersResponse + "' is wrong answer ;(. Correct answer was '" + correctAns + "'.");
                System.out.println("Let's try again, " + getNameOnly() + "!");
                break;
            }
        }
        sc.close();
    }
}
