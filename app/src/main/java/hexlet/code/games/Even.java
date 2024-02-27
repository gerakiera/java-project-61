package hexlet.code.games;

import hexlet.code.Core;
import static hexlet.code.Utils.getRandom;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RND_MAX_NUM = 200;
    public static void evenGame() {
        String[][] questionsAndAnswers =
                new String[Core.COUNT_ROUNDS][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int randomNumber = getRandom(RND_MAX_NUM);
            questionsAndAnswers[count][0] = randomNumber + "";
            questionsAndAnswers[count][1] = isEven(randomNumber) ? "yes" : "no";
            count++;
        }
        Core.playGame(RULES, questionsAndAnswers);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
