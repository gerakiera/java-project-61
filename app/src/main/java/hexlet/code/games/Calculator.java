package hexlet.code.games;

import hexlet.code.Core;
import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int RND_MAX_ACTION = 3;
    private static final int RND_MAX_NUM = 20;

    public static void calculatorGame() {
        Core.doGreetingAndRules(RULES);
        String[][] questionsAndAnswers = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_3][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        String[] action = new String[]{"+", "-", "*"};
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int indexAction = new Random().nextInt(RND_MAX_ACTION);
            String rndAction = action[indexAction];
            int rndNum1 = new Random().nextInt(RND_MAX_NUM);
            int rndNum2 = new Random().nextInt(RND_MAX_NUM);
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_0] = rndNum1 + " " + rndAction + " " + rndNum2;
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_1] = String.valueOf((isCalc(rndAction, rndNum1, rndNum2)));
            count++;
        }
        Core.playGame(questionsAndAnswers);
    }
    public static int isCalc(String action, int num1, int num2) {
        int result = 0;
        switch (action) {
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                throw new Error("Incorrect operator");
        }
        return result;
    }
}
