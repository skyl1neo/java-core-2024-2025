package laba1.irl;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();

        int year = currentYear - age;
        System.out.printf("Ваш год рождения: %d",year);
        in.close();
    }
}
