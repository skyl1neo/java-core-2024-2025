package laba1.irl;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first = in.nextInt();

        System.out.println("Введите второе число: ");
        int second = in.nextInt();

        int third = first + second;
        System.out.printf("Сумма двух чисел: %d", third);
        in.close();
    }
}