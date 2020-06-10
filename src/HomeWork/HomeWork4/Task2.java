package HomeWork.HomeWork4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int inputNumber = sc.nextInt();

        if (inputNumber == 0) {
            System.out.println("Это нулевое число");
            return;
        }

        Task2.plusMinusInfoHandler(inputNumber);
        Task2.parityInfoHandler(inputNumber);
    }

    private static void plusMinusInfoHandler(int number) {
        System.out.println("Это " + (number < 0 ? "отрицательное" : "положительное") + " число");
    }

    private static void parityInfoHandler(int number) {
        System.out.println("Это " + (number % 2 == 0 ? "четное" : "нечетное") + " число");
    }
}
