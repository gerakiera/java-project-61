package hexlet.code.games;

import hexlet.code.Core;

import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int RND_MAX_START = 20;
    private static final int RND_MAX_STEP = 8;
    private static final int RND_MAX_INDEX = 10;
    private static final int MAX_IN_ARRAY = 10;
    private static final int ELEMENT_TO_REPLACE = 100;

    public static void gameProgression() {
        Core.doGreetingAndRules(RULES);
        String[][] questionsAndAnswers = new String[Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_3][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int start = new Random().nextInt(RND_MAX_START);
            int step = new Random().nextInt(RND_MAX_STEP);
            int randomIndex = new Random().nextInt(RND_MAX_INDEX);
            int[] progression = getProgression(start, step, MAX_IN_ARRAY);
            progression[randomIndex] = ELEMENT_TO_REPLACE;
            StringBuilder question = new StringBuilder();
            for (var i = 0; i < progression.length; i++) {
                String part = progression[i] == ELEMENT_TO_REPLACE ? ".. " : progression[i] + " ";
                question.append(part);
            }
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_0] = String.valueOf(question);
            questionsAndAnswers[count][Core.INDEX_FOR_ARR_1] = String.valueOf(getAnsw(progression, randomIndex, start, step));
            count++;
        }
        Core.playGame(questionsAndAnswers);
    }
    public static int[] getProgression(int startNumber, int step, int progLength) {
        int[] progression = new int[progLength];
        for (var i = 0; i < progLength; i++) {
            progression[i] = startNumber;
            startNumber += step;
        }
        return progression;
    }
    private static int getAnsw(int[] arr, int index, int a, int b) {
        for (var i = 0; i < arr.length; i++) {
            arr[i] = a + i * b;
        }
        return arr[index];
    }
}
