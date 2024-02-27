package hexlet.code.games;

import hexlet.code.Core;
import static hexlet.code.Utils.getRandom;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RND_MAX_NUM = 200;
    public static void gamePrime() {
        String[][] questionsAndAnswers =
                new String[Core.COUNT_ROUNDS][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            var randomNumber = getRandom(RND_MAX_NUM);
            questionsAndAnswers[count][0] = randomNumber + "";
            questionsAndAnswers[count][1] = isPrime(randomNumber) ? "yes" : "no";
            count++;
        }
        Core.playGame(RULES, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
