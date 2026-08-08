package hexlet.code.game;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    private static final Random RANDOM = new Random();

    private ProgressionGame() {
    }

    public static void start(Scanner scanner, String name, int numberRounds) {

        System.out.println("What number is missing in the progression?");

        for (int round = 1; round < numberRounds; round++) {
            int lengthOfProgression = RANDOM.nextInt(5, 11);
            int hiddenElement = RANDOM.nextInt(1, lengthOfProgression + 1);
            int step = 5;
            int[] elements = generateElements(lengthOfProgression, step);
            String stringElements = convertToString(elements, hiddenElement);
            String answer = String.valueOf(elements[hiddenElement]);

            System.out.println(String.join(" ", "Round", String.valueOf(round)));
            System.out.println(String.join(" ", "Question:", stringElements));
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

    private static int[] generateElements(int lengthOfProgression, int step) {
        int startNumber = RANDOM.nextInt(20);
        int[] data = new int[lengthOfProgression];
        data[0] = startNumber;
        int number = startNumber;

        for (int i = 1; i < data.length; i++) {
            number = number + step;
            data[i] = number;
        }

        return data;
    }

    private static String convertToString(int[] elements, int hiddenElement) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < elements.length; i++) {
            if (i == hiddenElement) {
                result.append(".. ");
            } else {
                result.append(elements[i]);
                if (i < elements.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}
