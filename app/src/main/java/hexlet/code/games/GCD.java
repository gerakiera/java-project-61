package hexlet.code.games;

import hexlet.code.Core;
import java.util.Random;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int RND_MAX_NUM = 50;
    public static void gcdGame() {
        Core.doGreetingAndRules(RULES);
        String[][] questionsAndAnswers = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_3][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int rndNum1 = new Random().nextInt(RND_MAX_NUM);
            int rndNum2 = new Random().nextInt(RND_MAX_NUM);
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_0] = rndNum1 + " " + rndNum2;
            questionsAndAnswers[count][1] = String.valueOf(isGcd(rndNum1, rndNum2));
            count++;
        }
        Core.playGame(questionsAndAnswers);
    }
    public static int isGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
