package laba1.irl;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - year;
        System.out.printf("Вас зовут: %s Ваш возраст: %d",name, age);
        in.close();
    }
}
