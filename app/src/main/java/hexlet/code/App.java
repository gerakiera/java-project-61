package hexlet.code;

import games.Even;
import games.Calculator;
import java.util.Scanner;

import games.GCD;
import games.Progression;
import hexlet.code.Cli;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                //+ "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println();
        if (userChoice == 0) {
            System.out.println("See you next time!");
        }
        if (userChoice == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli cli = new Cli();
            cli.getName();
        }
        if (userChoice == 2) {
            Even.evenGame();
        }
        if (userChoice == 3) {
            Calculator.calculatorGame();
        }
        if (userChoice == 4) {
            GCD.gcdGame();
        }
        if (userChoice == 5) {
            Progression.gameProgression();
        }
    }
}