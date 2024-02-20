package hexlet.code.games;

import hexlet.code.Core;
import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RND_MAX_NUM = 200;
    public static void evenGame() {
        Core.doGreetingAndRules(RULES);
        String[][] questionsAndAnswers =
                new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_3][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int randomNumber = new Random().nextInt(RND_MAX_NUM);
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_0] = randomNumber + "";
            questionsAndAnswers[count][1] = isEven(randomNumber) ? "yes" : "no";
            count++;
        }
        Core.playGame(questionsAndAnswers);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
