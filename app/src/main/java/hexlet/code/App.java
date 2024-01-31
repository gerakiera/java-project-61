package hexlet.code;

import games.Even;
import games.Calculator;
import java.util.Scanner;

import games.GCD;
import games.Progression;
import games.Prime;

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
        if (userChoice == EXIT_NUMBER) {
            System.out.println("See you next time!");
        }
        if (userChoice == GREETING_NUMBER) {
            System.out.println("Welcome to the Brain Games!");
            Cli cli = new Cli();
            cli.getName();
        }
        if (userChoice == EVEN_GAME_NUMBER) {
            Even.evenGame();
        }
        if (userChoice == CALC_GAME_NUMBER) {
            Calculator.calculatorGame();
        }
        if (userChoice == GCD_GAME_NUMBER) {
            GCD.gcdGame();
        }
        if (userChoice == PROGRESSION_GAME_NUMBER) {
            Progression.gameProgression();
        }
        if (userChoice == PRIME_GAME_NUMBER) {
            Prime.gamePrime();
        }
    }
}
