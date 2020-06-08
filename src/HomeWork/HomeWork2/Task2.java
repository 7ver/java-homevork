package HomeWork.HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final double TAX_MODIFICATOR = 0.87;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите вашу зарплату:");
        double salary = sc.nextInt();
        double salaryWithoutTaxes = salary * TAX_MODIFICATOR;
        double taxesPayed = salary - salaryWithoutTaxes;

        System.out.println("На руки вы получите " + salaryWithoutTaxes);
        System.out.println("И заплатите " + taxesPayed + " налогов");
    }
}
