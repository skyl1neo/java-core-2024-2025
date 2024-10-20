package laba2.irl;

import java.util.Scanner;

public class zadanie2 {
	public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        if(number % 5 == 2 && number % 7 == 1) {
        	System.out.println("Число соответствует критериям");
        }
        
        else {
        	System.out.println("Число не соответстует ни одному критерию");
        }
        in.close();
        }
}
