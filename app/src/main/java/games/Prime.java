package games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_NUM = 200;
    public static void gamePrime() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while (correctAnswers < COUNT_ROUNDS) {
            var randomNumber = rnd.nextInt(RND_MAX_NUM);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playersResponse = sc.next();
            String correctAns = isPrime(randomNumber) ? "yes" : "no";
            if (playersResponse.equals(correctAns)) {
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

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

