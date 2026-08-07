package hexlet.code.game;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    private static final Random RANDOM = new Random();

    private EvenGame() {
    }

    public static void start(Scanner scanner, String name, int numberRounds) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int round = 1; round < numberRounds; round++) {
            int number = RANDOM.nextInt(500);
            String answer;

            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }

            System.out.println(String.join(" ", "Round", String.valueOf(round)));
            System.out.println(String.join(" ", "Question:", String.valueOf(number)));
            String userAnswer = scanner.nextLine();
            System.out.println(String.join(" ", "Your answer:", userAnswer));

            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
                System.out.println(String.join(" ", "Congratulations,", name, "!"));
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println(String.join(" ", "Let's try again,", name, "!"));
            }
        }
    }
}
