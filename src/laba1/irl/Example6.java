package laba1.irl;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.printf("Name: %s Surname: %s lastname: %s \n", name, surname, lastname);
        in.close();
    }
}
