package hexlet.code.games;

import hexlet.code.Core;
import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int COUNT_ROUNDS = 3;
    private static final int RND_MAX_START = 20;
    private static final int RND_MAX_STEP = 8;
    private static final int RND_MAX_INDEX = 10;
    private static final int MAX_IN_ARRAY = 10;
    private static final int ELEMENT_TO_REPLACE = 100;

    public static void gameProgression() {
        Core.doGreetingAndRules(RULES);
        String[] correctAnsws = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        String[] questions = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY];
        int count = 0;
        while (count < COUNT_ROUNDS) {
            int start = new Random().nextInt(RND_MAX_START);
            int step = new Random().nextInt(RND_MAX_STEP);
            int randomIndex = new Random().nextInt(RND_MAX_INDEX);
            int[] progression = new int[MAX_IN_ARRAY];
            correctAnsws[count] = String.valueOf(getAnsw(progression, randomIndex, start, step));
            progression[randomIndex] = ELEMENT_TO_REPLACE;
            String question = "";
            for (var i = 0; i < progression.length; i++) {
                String part = progression[i] == ELEMENT_TO_REPLACE ? ".. " : progression[i] + " ";
                question = question + part;
            }
            questions[count] = question;
            count++;
        }
        Core.playGame(correctAnsws, questions);

    }
    private static int getAnsw(int[] arr, int index, int a, int b) {
        for (var i = 0; i < arr.length; i++) {
            arr[i] = a + i * b;
        }
        return arr[index];
    }
}
