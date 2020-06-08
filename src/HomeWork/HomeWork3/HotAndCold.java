package HomeWork.HomeWork3;

import java.util.Scanner;
import java.util.Random;

public class HotAndCold {
    public static void main(String[] args) {
        System.out.println("Сыграем в игру: 'Горячо и холодно'");
        System.out.println("Я задумал число между 1 и 100, поробуй отгадать его");

        HotAndCold.randomNumber = new Random().nextInt(100) + 1;
        HotAndCold.startGameIteration();
    }

    private static int randomNumber;
    private static int attemptCount = 10;

    private static void startGameIteration() {
        if (HotAndCold.loseStateHandle()) {
            return;
        }

        System.out.println();
        System.out.println("У тебя осталось " + HotAndCold.attemptCount + " попыток.");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();

        if (HotAndCold.invalidNumberHandle(userinput)) {
            startGameIteration();
            return;
        }

        HotAndCold.attemptCount--;

        if (HotAndCold.winStateHandle(userinput)) {
            return;
        }

        HotAndCold.continueStateHandle(userinput);
    }

    private static boolean invalidNumberHandle(int number) {
        if (number <= 0 || number > 100) {
            System.out.println();
            System.out.println("Введите число в диапазоне от 1 до 100");
            System.out.println();
            return true;
        }
        return false;
    }

    private static boolean winStateHandle(int number) {
        if (number == HotAndCold.randomNumber) {
            System.out.println("Поздравляю! Вы угадали");
            return true;
        }
        return false;
    }

    private static boolean loseStateHandle() {
        if (HotAndCold.attemptCount == 0) {
            System.out.println("Вы проиграли.");
            return true;
        }
        return false;
    }

    private static void continueStateHandle(int number) {
        if (number < HotAndCold.randomNumber) {
            System.out.println("Холодно");
        } else {
            System.out.println("Горячо");
        }

        HotAndCold.startGameIteration();
    }
}
