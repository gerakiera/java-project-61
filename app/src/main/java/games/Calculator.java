package games;

import hexlet.code.Core;
import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int RND_MAX_ACTION = 3;
    private static final int RND_MAX_NUM = 20;

    public static void calculatorGame() {
        Core.doGreetingAndRules(RULES);
        String[] correctAnsws = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] action = new String[] {"+", "-", "*"};
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int indexAction = new Random().nextInt(RND_MAX_ACTION);
            String rndAction = action[indexAction];
            int rndNum1 = new Random().nextInt(RND_MAX_NUM);
            int rndNum2 = new Random().nextInt(RND_MAX_NUM);
            questions[count] = rndNum1 + " " + rndAction + " " + rndNum2;
            correctAnsws[count] = String.valueOf(isCalc(rndAction, rndNum1, rndNum2));
            count++;
        }
        Core.playGame(correctAnsws, questions);
    }
    public static int isCalc(String action, int num1, int num2) {
        if (action.equals("-")) {
            return num1 - num2;
        }
        if (action.equals("+")) {
            return num1 + num2;
        }
        if (action.equals("*")) {
            return num1 * num2;
        }
        return 0;
    }
}
