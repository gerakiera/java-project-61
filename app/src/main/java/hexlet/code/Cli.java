package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    public static String getName () {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
