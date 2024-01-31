package games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_START = 20;
    private static final int RND_MAX_STEP = 8;
    private static final int RND_MAX_INDEX = 11;
    private static final int MAX_IN_ARRAY = 10;
    private static final int ELEMENT_TO_REPLACE = 100;
    public static void gameProgression() {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
        System.out.println(RULES);
        int correctAnswers = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while (correctAnswers < COUNT_ROUNDS) {
            int start = rnd.nextInt(RND_MAX_START);
            int step = rnd.nextInt(RND_MAX_STEP);
            int randomIndex = rnd.nextInt(RND_MAX_INDEX);
            int[] progression = new int[MAX_IN_ARRAY];
            for (var i = 0; i < progression.length; i++) {
                progression[i] = start + i * step;
            }
            System.out.print("Question: ");
            int correctAns = progression[randomIndex];
            progression[randomIndex] = ELEMENT_TO_REPLACE;
            for (var i = 0; i < progression.length; i++) {
                if (progression[i] == ELEMENT_TO_REPLACE) {
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
