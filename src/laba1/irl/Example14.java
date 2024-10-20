package laba1.irl;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();

        int firstNumber = number - 1;
        int thirdNumber = number + 1;

        int sum = firstNumber+thirdNumber+number;

        double fourthNumber = Math.pow(sum, 2);
        System.out.printf("firstNumber: %d number: %d thirdNumber: %d fourthNumber: %.2f \n", firstNumber, number, thirdNumber,fourthNumber );
        in.close();


    }
}
