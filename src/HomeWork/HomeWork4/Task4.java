package HomeWork.HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4.progressionTypeHandler();
        Task4.startNumber = Task4.getUserInput("Введите число для формирования прогрессии.");
        Task4.iterationCount = Task4.getUserInput("Введите длину прогрессии.");

        System.out.println(Task4.getProgressionString());
    }

    private static int progressionType;
    private static int startNumber;
    private static int iterationCount;

    private static void progressionTypeHandler() {
        int type = Task4.getUserInput("Введите тип прогрессии: 1 - Арифметическая, 2 - Геометрическая.");

        if (type != 1 && type != 2) {
            System.out.println("Неверный тип прогрессии");
            Task4.progressionTypeHandler();
            return;
        }

        Task4.progressionType = type;
    }

    private static int getUserInput(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static int[] getAriphmeticalProgressionArray() {
        int[] progressionArray = new int[Task4.iterationCount];
        int current = 0;

        for(int i = 0; i < Task4.iterationCount; i++) {
            current += Task4.startNumber;
            progressionArray[i] = current;
        }

        return progressionArray;
    }

    private static int[] getGeometricalProgressionArray() {
        int[] progressionArray = new int[Task4.iterationCount];
        int current = 1;

        for(int i = 0; i < Task4.iterationCount; i++) {
            current *= Task4.startNumber;
            progressionArray[i] = current;
        }

        return progressionArray;
    }

    private static String getProgressionString() {
        return progressionType == 1
                ? Arrays.toString(Task4.getAriphmeticalProgressionArray())
                : Arrays.toString(Task4.getGeometricalProgressionArray());
    }
}
