package hexlet.code;

import hexlet.code.game.CalcGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.GCDGame;
import hexlet.code.game.ProgressionGame;

import java.util.Scanner;

public class Cli {
    private static String userName = "";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int NUMBER_ROUNDS = 3;

    private Cli() {
    }

    public static void menu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        String choice = SCANNER.nextLine();

        System.out.println(String.join(" ", "Your choice:", choice));

        if (choice.equals("1")) {
            greetUser();
        }

        if (choice.equals("2")) {
            greetUser();
            EvenGame.start(SCANNER, userName, NUMBER_ROUNDS);
        }

        if (choice.equals("3")) {
            greetUser();
            CalcGame.start(SCANNER, userName, NUMBER_ROUNDS);
        }

        if (choice.equals("4")) {
            greetUser();
            GCDGame.start(SCANNER, userName, NUMBER_ROUNDS);
        }

        if (choice.equals("5")) {
            greetUser();
            ProgressionGame.start(SCANNER, userName, NUMBER_ROUNDS);
        }

        if (choice.equals("0")) {
            System.out.println("Bye!");
        }

        SCANNER.close();
    }

    private static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = SCANNER.nextLine();
        System.out.println(String.join(" ", "Hello,", userName, "!"));
    }
}
