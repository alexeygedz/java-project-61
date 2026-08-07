package hexlet.code.game;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    private static final Random RANDOM = new Random();

    private GCDGame() {
    }

    public static void start(Scanner scanner, String name, int numberRounds) {

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int round = 1; round < numberRounds; round++) {
            int firstNumber = RANDOM.nextInt(50);
            int secondNumber = RANDOM.nextInt(50);
            String answer = String.valueOf(calculateAnswer(firstNumber, secondNumber));

            System.out.println(String.join(" ", "Round", String.valueOf(round)));
            System.out.println(
                String.join(" ", "Question:", String.valueOf(firstNumber), String.valueOf(secondNumber)));
            String userAnswer = scanner.nextLine();
            System.out.println(String.join(" ", "Your answer:", userAnswer));

            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
                System.out.println(String.join(" ", "Congratulations,", name, "!"));
            } else {
                System.out.println(
                    String.join("", "'", userAnswer, "'", " is wrong answer ;(. Correct answer was  ", "'", answer,
                        "'"));
                System.out.println(String.join(" ", "Let's try again,", name, "!"));
            }
        }
    }

    private static BigInteger calculateAnswer(int firstNumber, int secondNumber) {
        BigInteger first = BigInteger.valueOf(firstNumber);
        BigInteger second = BigInteger.valueOf(secondNumber);

        return first.gcd(second);
    }
}
