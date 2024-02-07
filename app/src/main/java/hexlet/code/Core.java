package hexlet.code;

import java.util.Scanner;

public class Core {
    public static final int COUNT_ROUNDS = 3;

    public static void playGame(int[] correctAnsws, String[] questions) {
        String name = Cli.getName();
        Scanner sc = new Scanner(System.in);
        int usersCorrectAnswersCount = 0;
        while (usersCorrectAnswersCount < COUNT_ROUNDS) {
            System.out.println("Question: " + questions[usersCorrectAnswersCount]);
            System.out.print("Your answer: ");
            int playersResponse = sc.nextInt();
            if (playersResponse == correctAnsws[usersCorrectAnswersCount]) {
                System.out.println("Correct!");
                usersCorrectAnswersCount++;
            } else {
                System.out.println("'" + playersResponse
                        + "' is wrong answer ;(. Correct answer was '" + correctAnsws[usersCorrectAnswersCount] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (usersCorrectAnswersCount == COUNT_ROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
        sc.close();
    }

    public static void doGreetingAndRules(String rules) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println(rules);
    }
}
