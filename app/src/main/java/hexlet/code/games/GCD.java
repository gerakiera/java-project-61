package hexlet.code.games;

import hexlet.code.Core;
import static hexlet.code.Utils.getRandom;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int RND_MAX_NUM = 50;
    public static void gcdGame() {
        String[][] questionsAndAnswers =
                new String[Core.COUNT_ROUNDS][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int rndNum1 = getRandom(RND_MAX_NUM);
            int rndNum2 = getRandom(RND_MAX_NUM);
            questionsAndAnswers[count][0] = rndNum1 + " " + rndNum2;
            questionsAndAnswers[count][1] = String.valueOf(isGcd(rndNum1, rndNum2));
            count++;
        }
        Core.playGame(RULES, questionsAndAnswers);
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
