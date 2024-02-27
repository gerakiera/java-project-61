package hexlet.code;

import java.util.Scanner;

public class Core {
    public static final int COUNT_ROUNDS = 3;
    public static final int NUMBER_OF_ELEMENTS_FOR_ARRAY_2 = 2;
    public static void playGame(String rules, String[][] questionsPlusAnswers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = sc.next();
        System.out.println("Hello, " + name + " !");
        System.out.println(rules);
        int usersCorrectAnswersCount = 0;
        while (usersCorrectAnswersCount < COUNT_ROUNDS) {
            String question = questionsPlusAnswers[usersCorrectAnswersCount][0];
            String correctAnswer = questionsPlusAnswers[usersCorrectAnswersCount][1];
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
}
