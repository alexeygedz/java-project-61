package hexlet.code;

import hexlet.code.game.EvenGame;

import java.util.Scanner;

public class Cli {
    private static String userName = "";
    private static final Scanner scanner = new Scanner(System.in);

    private Cli() {
    }

    public static void menu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        String choice = scanner.nextLine();

        System.out.println(String.join(" ", "Your choice:", choice));

        if (choice.equals("1")) {
            greetUser();
        }

        if (choice.equals("2")) {
            greetUser();
            EvenGame.start(scanner, userName);
        }

        if (choice.equals("0")) {
            System.out.println("Bye!");
        }

        scanner.close();
    }

    private static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println(String.join(" ", "Hello,", userName, "!"));
    }
}
