package HomeWork.HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final int GASOLINE_PRICE = 43;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество литров:");
        int amount = sc.nextInt();
        System.out.println(amount + " литров бензина стоят " + (amount * GASOLINE_PRICE));
    }
}
