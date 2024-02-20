package hexlet.code;

import java.util.Scanner;

public class Core {
    public static final int COUNT_ROUNDS = 3;
    public static final int NUMBER_OF_ELEMENTS_FOR_ARRAY_3 = 3;
    public static final int NUMBER_OF_ELEMENTS_FOR_ARRAY_2 = 2;
    public static final int INDEX_FOR_ARR_0 = 0;
    public static final int INDEX_FOR_ARR_1 = 1;
    public static void playGame(String[][] questionsPlusAnswers) {
        String name = Cli.getName();
        Scanner sc = new Scanner(System.in);
        int usersCorrectAnswersCount = 0;
        while (usersCorrectAnswersCount < COUNT_ROUNDS) {
            String question = questionsPlusAnswers[usersCorrectAnswersCount][INDEX_FOR_ARR_0];
            String correctAnswer = questionsPlusAnswers[usersCorrectAnswersCount][INDEX_FOR_ARR_1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String playersResponse = sc.next();
            if (playersResponse.equals(correctAnswer)) {
                System.out.println("Correct!");
                usersCorrectAnswersCount++;
            } else {
                System.out.println("'" + playersResponse + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
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
