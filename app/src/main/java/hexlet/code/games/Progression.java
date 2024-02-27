package hexlet.code.games;

import hexlet.code.Core;
import static hexlet.code.Utils.getRandom;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int RND_MAX_START = 20;
    private static final int RND_MIN_STEP = 1;
    private static final int RND_MAX_STEP = 8;
    private static final int RND_MAX_INDEX = 10;
    private static final int MAX_IN_ARRAY = 10;
    public static void gameProgression() {
        String[][] questionsAndAnswers =
                new String[Core.COUNT_ROUNDS][Core.NUMBER_OF_ELEMENTS_FOR_ARRAY_2];
        int count = 0;
        while (count < Core.COUNT_ROUNDS) {
            int start = getRandom(RND_MAX_START);
            int step = getRandom(RND_MIN_STEP, RND_MAX_STEP);
            int randomIndex = getRandom(RND_MAX_INDEX);
            String[] progression = getProgression(start, step, MAX_IN_ARRAY);
            String[] progressionWithMissElement = new String[progression.length];
            System.arraycopy(progression, 0, progressionWithMissElement, 0, RND_MAX_INDEX);
            var missingElement = progressionWithMissElement[randomIndex];
            progressionWithMissElement[randomIndex] = "..";
            String resultProgression = "";
            for (String s: progressionWithMissElement) {
                resultProgression += s + " ";
            }
            questionsAndAnswers[count][0] = resultProgression;
            questionsAndAnswers[count][1] = missingElement;
            count++;
        }
        Core.playGame(RULES, questionsAndAnswers);
    }
    public static String[] getProgression(int startNumber, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(startNumber);
            startNumber += step;
        }
        return progression;
    }
}
