package homework.homework2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final int GASOLINE_PRICE = 43;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество литров:");
        int amount = sc.nextInt();
        System.out.println(amount + " литров бензина стоят " + (amount * GASOLINE_PRICE));

        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.1")).add(new BigDecimal("0.1")));
    }
}
