package hexlet.code;

import code.Cli;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
                Scanner scAnswer = new Scanner(System.in);
        String answer = scAnswer.next();
        System.out.println("Your choice: " + answer + "\n");
        if (answer.equals("0")) {
            System.out.println("See you next time!");
        }
        if (answer.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Cli cli = new Cli();
            cli.getName();
        }
        else {
            System.out.println("wrong");
        }
    }
}
