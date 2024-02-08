package games;


import hexlet.code.Core;
import java.util.Random;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_NUM = 200;
    public static void gamePrime() {
        Core.doGreetingAndRules(RULES);
        String[] correctAnsws = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        int count = 0;
        while (count < COUNT_ROUNDS) {
            var randomNumber = new Random().nextInt(RND_MAX_NUM);
            String correctAnsw = isPrime(randomNumber) ? "yes" : "no";
            questions[count] = randomNumber + "";
            correctAnsws[count] = correctAnsw;
            count++;
        }
        Core.playGame(correctAnsws, questions);
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
