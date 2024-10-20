package laba2.irl;

import java.util.Scanner;
public class zadanie1 {
	 public static void main(String[] args){

	        Scanner in = new Scanner(System.in);

	        System.out.println("Введите число: ");
	        int number = in.nextInt();

	        if(number % 3 == 0) {
	        	System.out.println("Ваше число делится на 3");
	        }
	        else {
	        	System.out.println("Ваше число не делится на 3");
	        }
	        in.close();
	        }
}
