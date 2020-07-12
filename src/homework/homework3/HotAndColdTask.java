package homework.homework3;

import java.util.Random;
import java.util.Scanner;

public class HotAndColdTask {
    public static void main(String[] args) {
        System.out.println("Сыграем в игру: 'Горячо и холодно'");
        System.out.println("Я задумал число между 1 и 100, поробуй отгадать его");
        System.out.println("Если введеное тобой число будет ближе к загаданному чем предыдущее");
        System.out.println("то я отвечу 'Горячо', если дальше то 'Холодно'.");
        System.out.println("Введи 0, чтобы выйти из игры");

        HotAndColdTask.randomNumber = new Random().nextInt(100) + 1;
        HotAndColdTask.startGameIteration();
    }

    private static int randomNumber;
    private static int previousInput = 0;

    private static void startGameIteration() {
        System.out.println();
        System.out.println("Введи число");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput == 0) {
            System.out.println("Игра закончена");
            return;
        }

        if (userInput < 0 || userInput > 100) {
            System.out.println("Число должно быть от 1 до 100");
            HotAndColdTask.startGameIteration();
            return;
        }

        if (userInput == HotAndColdTask.randomNumber) {
            System.out.println("Вы угадали!");
            return;
        }

        HotAndColdTask.continueGameHandler(userInput);
    }

    private static void continueGameHandler(int userInput) {
        if (HotAndColdTask.isNewIntCloserToRandom(userInput)) {
            System.out.println("Горячо");
        } else {
            System.out.println("Холодно");
        }
        HotAndColdTask.previousInput = userInput;
        HotAndColdTask.startGameIteration();
    }

    private static int getPositiveSubtractionRes(int first, int second) {
        int substractionRes = first - second;

        return substractionRes >= 0 ? substractionRes : -(substractionRes);
    }

    private static boolean isNewIntCloserToRandom(int newInput) {
        int oldSubstracionRes = HotAndColdTask.getPositiveSubtractionRes(
                HotAndColdTask.randomNumber,
                HotAndColdTask.previousInput
        );

        int newSubstractionRes = HotAndColdTask.getPositiveSubtractionRes(
                HotAndColdTask.randomNumber,
                newInput
        );

        return newSubstractionRes < oldSubstracionRes;
    }
}
