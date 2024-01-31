package games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int COUNT_ROUNDS = 3;
    public static void gameProgression() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while (correctAnswers < COUNT_ROUNDS) {
            int start = rnd.nextInt(20);
            int step = rnd.nextInt(8);
            int randomIndex = rnd.nextInt(11);
            int[] progression = new int[10];
            for (var i = 0; i < progression.length; i++) {
                progression[i] = start + i * step;
            }
            System.out.print("Question: ");
            int correctAns = progression[randomIndex];
            progression[randomIndex] = 100;
            for (var i = 0; i < progression.length; i++) {
                if (progression[i] == 100) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }
            System.out.print("Your answer: ");
            int playersResponse = sc.nextInt();
            if (playersResponse == correctAns) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + playersResponse + "' is wrong answer ;(. Correct answer was '" + correctAns + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        sc.close();
    }
}