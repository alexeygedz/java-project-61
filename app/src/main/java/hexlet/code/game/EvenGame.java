package hexlet.code.game;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    private static final Random RANDOM = new Random();

    private EvenGame() {
    }

    public static void start(Scanner scanner, String name) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int number = RANDOM.nextInt(500);
            String answer;

            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }

            System.out.println(String.join(" ", "Question:", String.valueOf(number)));
            String userAnswer = scanner.nextLine();
            System.out.println(String.join(" ", "Your answer:", userAnswer));

            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println(String.join(" ", "Let's try again,", name, "!"));
                return;
            }
        }

        System.out.println(String.join(" ", "Congratulations,", name, "!"));
    }
}
