package hexlet.code;

import java.util.Scanner;

/* CLI app: System.out is the GUI here, not logging */
@SuppressWarnings({"java:S106"})
public class Cli {
    private Cli() {
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        String choice = scanner.nextLine();

        System.out.println(String.join(" ", "Your choice:", choice));

        if (choice.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String name = scanner.nextLine();
            System.out.println(String.join(" ", "Hello,", name, "!"));
        }

        scanner.close();
    }
}
