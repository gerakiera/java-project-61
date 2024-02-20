package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String inputName  = sc.next();
        System.out.println("Hello, " + inputName + "!");
        return inputName;
    }
}
