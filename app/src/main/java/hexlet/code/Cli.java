package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void getName () {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getNameOnly() {
        return userName;
    }
}
