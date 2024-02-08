package games;

import hexlet.code.Core;
import java.util.Random;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_NUM = 50;
    public static void gcdGame() {
        Core.doGreetingAndRules(RULES);
        int[] correctAnsws = new int[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        int count = 0;
        while (count < COUNT_ROUNDS) {
            int rndNum1 = new Random().nextInt(RND_MAX_NUM);
            int rndNum2 = new Random().nextInt(RND_MAX_NUM);
            questions[count] = rndNum1 + " " + rndNum2;
            correctAnsws[count] = isGcd(rndNum1, rndNum2);
            count++;
        }
        Core.playGame(correctAnsws, questions);
    }
    public static int isGcd (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
