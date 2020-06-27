package homeWork.homeWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final int SECONDS_IN_ONE_HOUR = 60 * 60;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество секунд:");
        int seconds = sc.nextInt();
        int hours = seconds / SECONDS_IN_ONE_HOUR;

        System.out.println("В " + seconds + " секундах, " + hours + " часов.");
    }
}
