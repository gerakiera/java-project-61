package games;

import hexlet.code.Core;

import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int RND_MAX_ACTION = 3;
    private static final int RND_MAX_NUM = 20;

    public static void calculatorGame() {
        Core.doGreetingAndRules(RULES);
        int[] correctAnsws = new int[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int choiceAction = new Random().nextInt(RND_MAX_ACTION);
            String rndAction = "null";
            int correctAnsw = 0;
            int rndNum1 = new Random().nextInt(RND_MAX_NUM);
            int rndNum2 = new Random().nextInt(RND_MAX_NUM);
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
            questions[count] = rndNum1 + " " + rndAction + " " + rndNum2;
            correctAnsws[count] = correctAnsw;
            count++;
        }
        Core.playGame(correctAnsws, questions);
    }
}
