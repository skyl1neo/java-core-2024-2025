package laba5.irl;
import java.util.Scanner;

public class zadacha1 {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSymbolCode() {
        return (int) symbol;
    }

    public void printSymbolInfo() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }

    public static void main(String[] args) {
        zadacha1 charHandler = new zadacha1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            charHandler.setSymbol(input.charAt(0));

            System.out.println("Код символа: " + charHandler.getSymbolCode());

            charHandler.printSymbolInfo();
        } else {
            System.out.println("Ошибка: необходимо ввести ровно один символ.");
        }

        scanner.close();
    }
}
