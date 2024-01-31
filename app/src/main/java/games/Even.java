package games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.getNameOnly;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli();
        cli.getName();
        System.out.println(RULES);
        Random rnd = new Random();
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        while (correctAnswers < 3) {
            int randomNumber = rnd.nextInt(200);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playersResponse = sc.next();
            if ((randomNumber % 2 == 0 && playersResponse.equals("yes")) || (randomNumber % 2 != 0 && playersResponse.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";
                System.out.println("'" + playersResponse + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + getNameOnly() + "!");
                break;
            }
        }
        sc.close();
    }
}
