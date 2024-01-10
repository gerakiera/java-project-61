package code;

import java.util.Scanner;

public class Cli {
    public static void getName () {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
