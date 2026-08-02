package hexlet.code;

import hexlet.code.game.EvenGame;

import java.util.Scanner;

/* CLI app: System.out is the GUI here, not logging */
@SuppressWarnings({"java:S106"})
public class Cli {
    private Cli() {
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");

            String choice = scanner.nextLine();

            System.out.println(String.join(" ", "Your choice:", choice));

            if (choice.equals("0")) {
                System.out.println("Bye!");
                break;
            }

            if (choice.equals("1")) {
                System.out.println("Welcome to the Brain Games!");
                System.out.println("May I have your name?");
                userName = scanner.nextLine();
                System.out.println(String.join(" ", "Hello,", userName, "!"));
            }

            if (choice.equals("2")) {
                EvenGame.start(scanner, userName);
            }
        }


        scanner.close();
    }
}
