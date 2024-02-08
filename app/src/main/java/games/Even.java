package games;

import hexlet.code.Core;
import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_NUM = 200;
    public static void evenGame() {
        Core.doGreetingAndRules(RULES);
        String[] correctAnsws = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        int count = 0;
        while (count < COUNT_ROUNDS) {
            int randomNumber = new Random().nextInt(RND_MAX_NUM);
            questions[count] = randomNumber + "";
            correctAnsws[count] = isEven(randomNumber);
            count++;
        }
        Core.playGame(correctAnsws, questions);
    }
    public static String isEven(int num) {
        return (num % 2 == 0) ? "yes" : "no";
    }
}
