package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import java.util.Scanner;

import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    static final int GREETING_NUMBER = 1;
    static final int EVEN_GAME_NUMBER = 2;
    static final int CALC_GAME_NUMBER = 3;
    static final int GCD_GAME_NUMBER = 4;
    static final int PROGRESSION_GAME_NUMBER = 5;
    static final int PRIME_GAME_NUMBER = 6;
    static final int EXIT_NUMBER = 0;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println();
        switch (userChoice) {
            case EXIT_NUMBER:
                System.out.println("See you next time!");
                break;
            case GREETING_NUMBER:
                System.out.println("Welcome to the Brain Games!");
                Cli.getName();
                break;
            case EVEN_GAME_NUMBER:
                Even.evenGame();
                break;
            case CALC_GAME_NUMBER:
                Calculator.calculatorGame();
                break;
            case GCD_GAME_NUMBER:
                GCD.gcdGame();
                break;
            case PROGRESSION_GAME_NUMBER:
                Progression.gameProgression();
                break;
            case PRIME_GAME_NUMBER:
                Prime.gamePrime();
                break;
            default:
                throw new Error("Unknown state!");
        }
    }
}
