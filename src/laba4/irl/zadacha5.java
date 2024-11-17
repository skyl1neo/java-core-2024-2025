package laba4.irl;

import java.util.Random;

public class zadacha5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        int[][] originalMatrix = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalMatrix[i][j] = random.nextInt(100);
                System.out.print(originalMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
