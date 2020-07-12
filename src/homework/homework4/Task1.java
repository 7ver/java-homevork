package homework.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int firstNumber = Task1.getUserInput("Введите первое число");
        int secondNumber = Task1.getUserInput("Введите второе число");

        if (firstNumber == secondNumber) {
            System.out.println("Эти числа равны");
            return;
        }

        System.out.println("Меньшее число " + Math.min(firstNumber, secondNumber));
    }

    private static int getUserInput(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
