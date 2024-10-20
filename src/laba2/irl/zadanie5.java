package laba2.irl;

import java.util.Scanner;

public class zadanie5 {
	public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int thousands = (number / 1000) % 10;

        System.out.println("Тысяч: " + Math.abs(thousands));
        in.close();
        }
}
