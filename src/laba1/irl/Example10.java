package laba1.irl;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - year;
        System.out.printf("Ваш возраст: %d", age);
        in.close();
    }
}
