package hexlet.code.game;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {

    private static final Random RANDOM = new Random();

    private CalcGame() {
    }

    public static void start(Scanner scanner, String name, int numberRounds) {

        System.out.println("What is the result of the expression?");

        for (int round = 0; round < numberRounds; round++) {
            int firstNumber = RANDOM.nextInt(2);
            int secondNumber = RANDOM.nextInt(2);
            String[] operators = {"+", "-", "*"};
            String randomOperator = operators[RANDOM.nextInt(3)];
            String answer = String.valueOf(calculateAnswer(firstNumber, secondNumber, randomOperator));

            System.out.println(String.join(" ", "Round", String.valueOf(round + 1)));
            System.out.println(String.join(" ", "Question:", String.valueOf(firstNumber), randomOperator,
                String.valueOf(secondNumber)));
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

    private static int calculateAnswer(int firstNumber, int secondNumber, String randomOperator) {
        int result = 0;

        if (randomOperator.equals("+")) {
            result = firstNumber + secondNumber;
        }
        if (randomOperator.equals("-")) {
            result = firstNumber - secondNumber;
        }
        if (randomOperator.equals("*")) {
            result = firstNumber * secondNumber;
        }

        return result;
    }
}